package app.gkuroda.sampleapplication.dagger

import android.content.Context
import app.gkuroda.sampleapplication.SampleApp
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {
    @Provides
    fun context(application: SampleApp): Context = application

}