package com.example.worldcupapp

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import org.w3c.dom.Text
import java.util.zip.Inflater

class MyAdapter(private var activity: Activity, private var items:ArrayList<CountryModel>): BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): CountryModel {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View?
        val viewHolder: ViewHolder
        if (convertView == null){
            val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.list_item, null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        val countries = items[position]
        viewHolder.txtName?.text = countries.name
        viewHolder.txtCups?.text = countries.cupWins
        viewHolder.flagImg?.setImageResource(countries.flagImg)

        view?.setOnClickListener {
            Toast.makeText(activity, "You chose: ${countries.name}", Toast.LENGTH_SHORT).show()
        }

        return view as View
    }

    private class ViewHolder(row: View?){
        var txtName: TextView? = null
        var txtCups: TextView? = null
        var flagImg: ImageView? = null


        init {
            this.txtName = row?.findViewById(R.id.countryName)
            this.txtCups = row?.findViewById(R.id.wins)
            this.flagImg = row?.findViewById(R.id.imageView)
        }
    }

}