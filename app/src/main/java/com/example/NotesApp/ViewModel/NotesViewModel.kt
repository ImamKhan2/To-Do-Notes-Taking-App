package com.example.NotesApp.ViewModel

import androidx.lifecycle.ViewModel
import com.example.NotesApp.Model.Notes
import com.example.NotesApp.Repository.NotesRepository

class NotesViewModel : ViewModel() {

    private val repository: NotesRepository = NotesRepository
    val allNotes = repository.allNotes

    fun insertNote(notes: Notes) {
        repository.insertNotes(notes)
    }

    fun deleteNote(notes: Notes) {
        repository.deleteNotes(notes)
    }

    fun updateNote(notes: Notes) {
        repository.updateNotes(notes)
    }
}
