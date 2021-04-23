package com.utab.onlinemarketkotlin.di

import com.utab.onlinemarketkotlin.view.fragment.splashScreen.SplashFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationGraph {
    fun inject(splashFragment: SplashFragment)
}