package com.shahmalav.groupiedemohorizontalrv

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var list: MutableList<GroupieItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         list = mutableListOf(
                GroupieItem("Things to do 1", "List of things for the day that will get you something."),
                GroupieItem("Things to do 2", "List of things for the day that will get you something."),
                GroupieItem("Things to do 3", "List of things for the day that will get you something."),
                GroupieItem("Things to do 4", "List of things for the day that will get you something."))
        initRecyclerView(list)
    }

    private fun initRecyclerView(items: List<GroupieItem>) {
        //initialize groupie's group adapter class and add the list of items
        val groupAdapter = GroupAdapter<GroupieViewHolder>().apply {
            addAll(items)
        }
        //set up the layout manager and set the adapter
        recyclerview.apply {
            adapter = groupAdapter
        }
        groupAdapter.setOnItemClickListener { item, view ->
          list.remove(item)
            groupAdapter.notifyItemRemoved(item.getPosition(item))
        }
    }
}
