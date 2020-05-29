package com.example.viewpager2sample

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager2sample.databinding.ClubRowBinding

class ClubsAdapter(private var ctx: Context?, private var listClubs: MutableList<Club>?) :
    RecyclerView.Adapter<ClubsAdapter.MyViewHolder>() {

    class MyViewHolder(val itemBinding: ClubRowBinding) : RecyclerView.ViewHolder(itemBinding.root){

        private var binding : ClubRowBinding? = null

        init {
            this.binding = itemBinding
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(ctx)
        val binding: ClubRowBinding = DataBindingUtil.inflate(inflater, R.layout.club_row,parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        listClubs?.let {
            return it.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.itemBinding.club = listClubs?.get(position)
    }

}