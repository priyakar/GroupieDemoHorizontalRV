package com.shahmalav.groupiedemohorizontalrv

import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_groupie.view.*


class GroupieItem(val title: String, val subtitle: String): Item() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.title.text = title
        viewHolder.itemView.subtitle.text = subtitle
    }

    override fun getLayout(): Int = R.layout.item_groupie
}