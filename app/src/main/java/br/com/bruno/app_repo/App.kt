package br.com.bruno.app_repo

import android.app.Application
import br.com.bruno.app_repo.data.di.DataModule
import br.com.bruno.app_repo.domain.di.DomainModule
import br.com.bruno.app_repo.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}