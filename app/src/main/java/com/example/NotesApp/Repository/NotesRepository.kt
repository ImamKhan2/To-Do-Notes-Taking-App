package com.example.NotesApp.Repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.NotesApp.DataBase.NotesDatabase
import com.example.NotesApp.Model.Notes
import com.example.NotesApp.Database.NotesDatabase

class NotesRepository(application: Application) {
    private val notesDao = NotesDatabase.getDatabase(application).notesDao()
    val allNotes: LiveData<List<Notes>> = notesDao.getAllNotes()

    fun insertNotes(notes: Notes) {
        // Implement insert logic
    }

    fun deleteNotes(notes: Notes) {
        // Implement delete logic
    }

    fun updateNotes(notes: Notes) {
        // Implement update logic
    }
}

