package com.iplant.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import com.iplant.R
import com.iplant.adapters.PlantsRecyclerAdapter
import com.iplant.databinding.FragmentSearchBinding
import com.iplant.utils.toast

class SearchFragment : Fragment() {

    private lateinit var viewModel: SearchViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        viewModel = ViewModelProvider(this).get(SearchViewModel::class.java)

        val binding: FragmentSearchBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_search, container, false
        )

        val plantsAdapter = PlantsRecyclerAdapter()
        binding.recyclerPlants.adapter = plantsAdapter
        binding.recyclerPlants.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))

        viewModel.plantsResultLiveData.observe(viewLifecycleOwner, {
            plantsAdapter.updateList(it)
        })

        viewModel.apiErrorLiveData.observe(viewLifecycleOwner, {
            toast(it)
        })

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String): Boolean {
                viewModel.searchPlants(newText)
                return false
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }
        })

        return binding.root
    }

}