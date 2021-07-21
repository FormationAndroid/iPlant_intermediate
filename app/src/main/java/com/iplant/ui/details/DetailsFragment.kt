package com.iplant.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.iplant.R
import com.iplant.databinding.FragmentDetailsBinding
import com.iplant.utils.toast

class DetailsFragment : Fragment() {

    private lateinit var viewModel: DetailsViewModel
    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)

        val binding: FragmentDetailsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_details, container, false
        )

        viewModel.plantDetailsResultLiveData.observe(viewLifecycleOwner, {
            it?.id?.let { id -> viewModel.setIdPlant(id) }
            binding.plant = it
        })

        viewModel.apiErrorLiveData.observe(viewLifecycleOwner, {
            toast(it)
        })

        viewModel.getPlantDetails(args.plantId)

        viewModel.plantFavoriteLiveData.observe(viewLifecycleOwner, {
            toast("test : $it")
        })

        binding.imageViewFavorite.setOnClickListener {
            viewModel.addOrRemoveFromFavorite()
        }

        return binding.root
    }
}