package app.gkuroda.sampleapplication.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.gkuroda.sampleapplication.dagger.model.UserSettingModel
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    private val userSettingModel: UserSettingModel
) : ViewModel() {

    val isSwitchEnable: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }

    // classが初期化された段階で実行される
    init {
        loadSwitchStatus()
    }

    fun loadSwitchStatus() {
        isSwitchEnable.postValue(userSettingModel.loadSwitchStatus())
    }

    fun saveSwitchStatus(isEnable: Boolean) {
        userSettingModel.saveSwitchStatus(isEnable)
    }
}