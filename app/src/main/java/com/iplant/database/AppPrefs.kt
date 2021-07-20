package com.iplant.database

import androidx.appcompat.app.AppCompatDelegate
import com.chibatching.kotpref.KotprefModel


object AppPrefs : KotprefModel() {
    var nightMode by intPref(default = AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
    var hideSynonyms by booleanPref(default = false)
}
