package app.gkuroda.sampleapplication.dagger.model

import android.content.Context
import android.content.SharedPreferences
import app.gkuroda.sampleapplication.R
import javax.inject.Inject

class UserSettingModel @Inject constructor(
    private val context: Context,
    private val sharedPreferences: SharedPreferences
) {

    private val SWITCH_STATUS_KEY = context.getString(R.string.switch_status_key)

    fun saveSwitchStatus(isEnable: Boolean) {
        sharedPreferences.edit().putBoolean(SWITCH_STATUS_KEY, isEnable).apply()
    }

    fun loadSwitchStatus(): Boolean = sharedPreferences.getBoolean(SWITCH_STATUS_KEY, false)


}