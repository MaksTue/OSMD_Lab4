package com.example.lab4

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TodoAdapter
    private lateinit var todoList: List<TodoItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        todoList = generateData()

        adapter = TodoAdapter(todoList)
        recyclerView.adapter = adapter

        updateTotalCount()

    }

    private fun generateData(): List<TodoItem> {
        val list = mutableListOf<TodoItem>()
        list.add(TodoItem("Wash the dishes"))
        list.add(TodoItem("Clone this repo"))
        list.add(TodoItem("cd to the folder"))
        list.add(TodoItem("npm install"))
        list.add(TodoItem("npm run dev"))
        list.add(TodoItem("Wash the dishes"))
        list.add(TodoItem("Clone this repo"))
        list.add(TodoItem("cd to the folder"))
        list.add(TodoItem("npm install"))
        list.add(TodoItem("npm run dev"))
        list.add(TodoItem("Wash the dishes"))
        list.add(TodoItem("Clone this repo"))
        list.add(TodoItem("cd to the folder"))
        list.add(TodoItem("npm install"))
        list.add(TodoItem("npm run dev"))
        return list
    }
    private fun updateTotalCount() {
        val totalCount = todoList.size
        val textViewTotal = findViewById<TextView>(R.id.textViewTotal)
        textViewTotal.text = "Total: $totalCount"
    }
}
