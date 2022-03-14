package app.gkuroda.sampleapplication

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class SampleApp: DaggerApplication()  {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        TODO("Not yet implemented")
    }
}