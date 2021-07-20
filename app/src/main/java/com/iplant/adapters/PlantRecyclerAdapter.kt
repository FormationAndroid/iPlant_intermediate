package com.iplant.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iplant.databinding.ItemPlantBinding
import com.iplant.models.Plant
import com.squareup.picasso.Picasso


class PlantRecyclerAdapter(
    private val plants: List<Plant>
) : RecyclerView.Adapter<PlantRecyclerAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            ItemPlantBinding.inflate(LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(plants[position])
    }

    inner class UserViewHolder(private val binding: ItemPlantBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(plant: Plant){
            binding.plant = plant
        }

    }

    override fun getItemCount() = plants.size

}

