package com.example.vezba

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var searchQuery: EditText
    private lateinit var addTagButton: Button
    private lateinit var tagsContainer: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        searchQuery = findViewById(R.id.searchQuery)
        addTagButton = findViewById(R.id.addTagButton)
        tagsContainer = findViewById(R.id.tagsContainer)


        addTagButton.setOnClickListener {
            val query = searchQuery.text.toString()
            if (query.isNotEmpty()) {
                addTag(query)
                searchQuery.text.clear()
            }
        }
    }


    private fun addTag(query: String) {
        val tagView = TextView(this).apply {
            text = query
            textSize = 16f
            setPadding(8, 8, 8, 8)
        }
        tagsContainer.addView(tagView)
    }
}