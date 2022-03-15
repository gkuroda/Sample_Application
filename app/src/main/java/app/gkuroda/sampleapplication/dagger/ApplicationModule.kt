package app.gkuroda.sampleapplication.dagger

import android.content.Context
import android.content.SharedPreferences
import app.gkuroda.sampleapplication.R
import app.gkuroda.sampleapplication.SampleApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {
    @Provides
    fun context(application: SampleApp): Context = application

    @Singleton
    @Provides
    fun apiBasePath(context: Context): String = context.getString(R.string.api_base_url)

    @Singleton
    @Provides
    fun sharedPreferences(context: Context): SharedPreferences = context.getSharedPreferences(
        context.getString(R.string.preference_file_key),
        Context.MODE_PRIVATE
    )

}