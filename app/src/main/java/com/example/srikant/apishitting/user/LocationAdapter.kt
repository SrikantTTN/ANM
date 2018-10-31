package com.example.srikant.apishitting.user

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.srikant.apishitting.R
import com.example.srikant.apishitting.databinding.LocationItemBinding
import com.example.srikant.apishitting.user.java_model.Location

class LocationAdapter(private var locList:List<Location>): RecyclerView.Adapter<LocationAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val inflater = LayoutInflater.from(p0.context)
        val locationBinding = LocationItemBinding.inflate(inflater,p0,false)
        return ViewHolder(locationBinding)
    }

    override fun getItemCount(): Int {
        return locList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val item = locList[p1]
        p0.bind(item)
    }

    class ViewHolder(private var binding: LocationItemBinding) :RecyclerView.ViewHolder(binding.root){

        fun bind(location: Location) {
            binding.location = location
            binding.executePendingBindings()
        }
    }
}