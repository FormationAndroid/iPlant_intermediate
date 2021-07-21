package com.iplant.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iplant.databinding.ItemPlantBinding
import com.iplant.models.Plant

class PlantsRecyclerAdapter( val onPlantSelected: (plant: Plant) -> Unit ) : RecyclerView.Adapter<PlantsRecyclerAdapter.UserViewHolder>() {

    private val plants = mutableListOf<Plant>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            ItemPlantBinding.inflate(LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    fun updateList(newPlants: List<Plant>){
        plants.clear()
        plants.addAll(newPlants)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(plants[position])
    }

    inner class UserViewHolder(private val binding: ItemPlantBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(plant: Plant){
            binding.plant = plant
            binding.root.setOnClickListener {
                onPlantSelected(plant)
            }
        }

    }

    override fun getItemCount() = plants.size

}
