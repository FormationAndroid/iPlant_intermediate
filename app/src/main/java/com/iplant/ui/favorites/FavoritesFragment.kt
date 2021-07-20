package com.iplant.ui.favorites

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.iplant.R
import com.iplant.api.retrofitClient
import com.iplant.databinding.FragmentFavoritesBinding
import com.iplant.models.stackoverflow.Questions
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class FavoritesFragment : Fragment() {

    private lateinit var favoritesViewModel: FavoritesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        favoritesViewModel = ViewModelProvider(this).get(FavoritesViewModel::class.java)

        val binding: FragmentFavoritesBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_favorites, container, false
        )

        favoritesViewModel.getLastQuestionsSuccess.observe(viewLifecycleOwner, {
            it?.items?.forEach {  item ->
                Log.d("TEST_LOG", item.title)
            }
        })

        favoritesViewModel.getLastQuestionsError.observe(viewLifecycleOwner, {
            Log.e("TEST_LOG", "ERROR : $it")
        })

        favoritesViewModel.getLastQuestions()


        return binding.root
    }


}