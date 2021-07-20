package com.iplant.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.iplant.R
import com.iplant.adapters.PlantRecyclerAdapter
import com.iplant.databinding.FragmentSearchBinding
import com.iplant.models.Plant

class SearchFragment : Fragment() {

    private lateinit var searchViewModel: SearchViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)

        val binding: FragmentSearchBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_search, container, false
        )


        val plants = mutableListOf<Plant>()
        plants.add(Plant("name1", "family1", "https://homepages.cae.wisc.edu/~ece533/images/tulips.png"))
        plants.add(Plant("name2", "family2", "https://homepages.cae.wisc.edu/~ece533/images/tulips.png"))
        plants.add(Plant("name3", "family3", "https://homepages.cae.wisc.edu/~ece533/images/tulips.png"))
        plants.add(Plant("name4", "family4", "https://homepages.cae.wisc.edu/~ece533/images/tulips.png"))

        val adapter = PlantRecyclerAdapter(plants)
        binding.recyclerPlants.adapter = adapter


        return binding.root
    }

}