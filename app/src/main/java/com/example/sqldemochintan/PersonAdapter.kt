package com.example.sqldemochintan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sqldemochintan.MainActivity
import com.example.sqldemochintan.R
import kotlinx.android.synthetic.main.card_view.view.*


class PersonAdapter(val context:Context,var arr:ArrayList<Fruit>)
    :RecyclerView.Adapter<PersonAdapter.PersonViewHolde>()

{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolde {
        var inflater=LayoutInflater.from(parent.context)
        var view= inflater.inflate(R.layout.card_view,parent,false)
        return PersonViewHolde(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolde, position: Int) {
        holder.bind(arr[position])

    }

    override fun getItemCount(): Int {
        return  arr.size
    }

    class PersonViewHolde(var view:View):RecyclerView.ViewHolder(view)
    {
        fun bind(p:Fruit)
        {
            view.tvname.setText(p.fr_name)
            view.tvdes.setText(p.fr_des)
            view.tvprice.setText(p.fr_price.toString())

        }
    }
}