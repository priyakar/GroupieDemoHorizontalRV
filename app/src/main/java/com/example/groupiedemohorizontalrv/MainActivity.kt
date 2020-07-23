package com.example.groupiedemohorizontalrv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shahmalav.groupiedemohorizontalrv.R

class MainActivity : AppCompatActivity() {


    /**
     * Set up a recyclerview to display 4 items.
     * Item click should remove that item from the recyclerview.
     */

    lateinit var list: List<TodoModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         list = listOf(
             TodoModel("Things to do 1", "List of things for the day that will get you something."),
             TodoModel("Things to do 2", "List of things for the day that will get you something."),
             TodoModel("Things to do 3", "List of things for the day that will get you something."),
             TodoModel("Things to do 4", "List of things for the day that will get you something.")
         )
        initRecyclerView(list)
    }

    private fun initRecyclerView(items: List<TodoModel>) {

    }
}
