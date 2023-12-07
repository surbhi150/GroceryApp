package com.example.groceryapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ItemsListAdapter(var itemsList: ArrayList<CategoryModel>) : BaseAdapter(){
    override fun getCount(): Int {
        return itemsList.size


    }

    override fun getItem(p0: Int): Any {
        return itemsList[p0]

    }

    override fun getItemId(p0: Int): Long {
        return 0L

    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = LayoutInflater.from(p2?.context).inflate(
            R.layout.category_item_list,p2,false)
        var tvCategory = view.findViewById<TextView>(R.id.tvCategory)
        tvCategory.setText("${itemsList[p0].name}")

        return view


    }

}
