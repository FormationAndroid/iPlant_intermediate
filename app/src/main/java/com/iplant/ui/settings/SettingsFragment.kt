package com.iplant.ui.settings

import android.app.Dialog
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.iplant.R
import com.iplant.database.AppPrefs
import com.iplant.databinding.DialogDeleteConfirmationBinding
import com.iplant.databinding.FragmentFavoritesBinding
import com.iplant.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private lateinit var settingsViewModel: SettingsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        settingsViewModel = ViewModelProvider(this).get(SettingsViewModel::class.java)

        val binding: FragmentSettingsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_settings, container, false
        )

        binding.switchNightMode.isChecked = AppPrefs.nightMode == AppCompatDelegate.MODE_NIGHT_YES
                    || context?.resources?.configuration?.uiMode?.and(Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
        binding.switchNightMode.setOnCheckedChangeListener { _, isChecked ->
            AppPrefs.nightMode = if (isChecked) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
        }

        binding.switchHideSynonyms.isChecked = AppPrefs.hideSynonyms
        binding.switchHideSynonyms.setOnCheckedChangeListener { _, isChecked ->
            AppPrefs.hideSynonyms = isChecked
        }

        binding.buttonClearData.setOnClickListener {
            val dialog = Dialog(requireContext())
            val dialogBinding: DialogDeleteConfirmationBinding = DataBindingUtil.inflate(
                LayoutInflater.from(requireContext()),
                R.layout.dialog_delete_confirmation,
                null,
                false
            )
            dialogBinding.btnYes.setOnClickListener {
                Toast.makeText(requireContext(), "Données supprimées", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            dialogBinding.btnNo.setOnClickListener {
                dialog.dismiss()
            }
            dialog.setContentView(dialogBinding.root)
            dialog.window?.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )

            dialog.show()
        }



        return binding.root
    }
}