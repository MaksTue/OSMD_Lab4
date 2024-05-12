package com.example.lab4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class TodoAdapter(private val todoList: List<TodoItem>) : RecyclerView.Adapter<TodoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_todo, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val todoItem = todoList[position]
        holder.textViewTodoItem.text = todoItem.task
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val checkBoxTodo: CheckBox = itemView.findViewById(R.id.checkBoxTodo)
        val textViewTodoItem: TextView = itemView.findViewById(R.id.textViewTodoItem)
        val imageViewDelete: ImageView = itemView.findViewById(R.id.imageViewDelete)
    }
}
