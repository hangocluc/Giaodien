package com.example.baitap1.data

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.baitap1.student.Student

class Database : SQLiteOpenHelper {
    var context:Context
constructor( context: Context):super(context,"table.db",null,1){
    this.context =context
}


    override fun onCreate(db: SQLiteDatabase?) {
        val table: String =
            "Create table  luc (name text, address text, phone Interger primary key)"

        db?.execSQL(table)


    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    fun insert(student: Student): Long {
        val sql: SQLiteDatabase = writableDatabase
        val contentValues: ContentValues = ContentValues()
        contentValues.put("name",student.name)
        contentValues.put("address", student.address)
        contentValues.put("number", student.number)
        val resutl: Long = sql.insert("luc",null,contentValues)
        sql.close()
        return resutl


    }
    fun getAll():List<Student>{
        val list:ArrayList<Student> = ArrayList()
        val sql:SQLiteDatabase = readableDatabase
        var select = "Select * from luc"
        val cursor:Cursor = sql.rawQuery(select,null )
        if(cursor.moveToFirst()){
            do{
                var  name=cursor.getString(cursor.getColumnIndex("name"))
                var  address= cursor.getString(cursor.getColumnIndex("address"))
                var number = cursor.getInt(cursor.getColumnIndex("number"))
                var student:Student = Student(name,address,number)
                list.add(student)
            }while (cursor.moveToNext());
            cursor.close()
        }
        sql.close()
        return list
    }
}