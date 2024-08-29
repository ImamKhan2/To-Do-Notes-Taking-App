package com.example.NotesApp.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.NotesApp.Model.Notes

@Dao
interface NotesDao {
    @Query("SELECT * FROM Notes_Database")
    fun getAllNotes(): LiveData<List<Notes>>

    @Insert
    fun insertNotes(vararg notes: Notes)

    @Query("DELETE FROM Notes_Database WHERE id =:id")
    fun deleteNotes(id: Notes)

    @Update
    fun updateNotes(notes: Notes)
}


