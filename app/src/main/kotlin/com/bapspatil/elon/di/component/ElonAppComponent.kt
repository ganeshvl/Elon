package com.bapspatil.elon.di.component

import android.content.Context
import com.bapspatil.elon.ElonApp
import com.bapspatil.elon.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/*
** Created by Bapusaheb Patil {@link https://bapspatil.com}
*/

/**
 * App component that has all the modules
 */
@Singleton
@Component(
        modules = [
            AndroidInjectionModule::class,
            ActivityModule::class,
            NetworkModule::class,
            RepositoryModule::class,
            UseCaseModule::class,
            UtilModule::class
        ]
)
interface ElonAppComponent : AndroidInjector<ElonApp> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): ElonAppComponent
    }
}