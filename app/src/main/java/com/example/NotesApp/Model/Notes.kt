package com.example.NotesApp.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Notes_Database")
data class Notes(

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "notes_title")
    val notesTitle: String,

    @ColumnInfo(name = "notes_subtitle")
    val notesSubtitle: String,

    @ColumnInfo(name = "notes_date")
    val notesDate: String,

    @ColumnInfo(name = "notes")
    val notes: String,

    @ColumnInfo(name = "notes_priority")
    val notesPriority: String
)

