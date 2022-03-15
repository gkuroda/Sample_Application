package app.gkuroda.sampleapplication.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.gkuroda.sampleapplication.R
import app.gkuroda.sampleapplication.dagger.viewModel.ViewModelFactory
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // @Inject で指定している変数に値を注入する
        AndroidInjection.inject(this)

        viewModel = viewModelFactory.get(this)


    }
}