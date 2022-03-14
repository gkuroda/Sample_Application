package app.gkuroda.sampleapplication.dagger

import app.gkuroda.sampleapplication.SampleApp
import app.gkuroda.sampleapplication.dagger.viewModel.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityModule::class,
        ApplicationModule::class,
        ViewModelModule::class
    ]
)

interface ApplicationComponent : AndroidInjector<SampleApp> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<SampleApp>

}