package app.gkuroda.sampleapplication.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import app.gkuroda.sampleapplication.R
import app.gkuroda.sampleapplication.dagger.viewModel.ViewModelFactory
import app.gkuroda.sampleapplication.databinding.ActivityMainBinding
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: MainActivityViewModel

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // @Inject で指定している変数に値を注入する
        AndroidInjection.inject(this)

        // bindingの初期化
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // LiveDataを使う際はlifecycleOwnerを指定してあげないといけない
        binding.lifecycleOwner = this

        //ViewModelの初期化
        viewModel = viewModelFactory.get(this)

        // MVVMにおける ViewとViewModelを結びつける工程
        // bindingにViewModelを渡す
        binding.viewModel = viewModel
    }
}