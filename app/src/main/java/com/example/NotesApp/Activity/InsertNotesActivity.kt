package com.example.NotesApp.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.NotesApp.Model.Notes
import com.example.NotesApp.ViewModel.NotesViewModel
import com.example.notesapp.R
import com.example.notesapp.databinding.ActivityInsertNotesBinding

class InsertNotesActivity : AppCompatActivity() {

    private var title: String? = null
    private var subtitle: String? = null
    private var notes: String? = null
    private lateinit var binding: ActivityInsertNotesBinding
    private lateinit var notesViewModel: NotesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInsertNotesBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        // Initialize ViewModel
        notesViewModel = ViewModelProvider(this).get(NotesViewModel::class.java)

        binding.doneNotesBtn.setOnClickListener {
            title = binding.notesTitle.text.toString()
            subtitle = binding.notesSubtitle.text.toString()
            notes = binding.notesData.text.toString()

            createNotes(title ?: "", subtitle ?: "", notes ?: "")
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun createNotes(title: String, subtitle: String, notes: String) {
        val notes1 = Notes(title, subtitle, notes)
        notesViewModel.insertNote(notes1)
    }
}



