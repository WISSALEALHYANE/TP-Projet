package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class dbconnexion extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Connexion";
    private static final int DATABASE_VERSION = 1;

    private static final String CREATE_TABLE1 = "CREATE TABLE inscription (" +
            "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "Email TEXT," +
            "motDePasse TEXT);";
    private static final String CREATE_TABLE = "CREATE TABLE annonce (" +
            "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "titre TEXT," +
            "categorie TEXT," +
            "secteur TEXT," +
            "typecontrat TEXT," +
            "ville TEXT);";

    public dbconnexion(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE1);
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Gestion des mises à jour de la base de données
        db.execSQL("DROP TABLE IF EXISTS inscription");
        db.execSQL("DROP TABLE IF EXISTS annonce");
        onCreate(db);
    }
}