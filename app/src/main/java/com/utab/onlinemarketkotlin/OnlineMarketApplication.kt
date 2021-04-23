package com.utab.onlinemarketkotlin

import android.app.Application
import com.utab.onlinemarketkotlin.di.ApplicationGraph
import com.utab.onlinemarketkotlin.di.DaggerApplicationGraph

class OnlineMarketApplication : Application() {
    private val applicationGraph: ApplicationGraph by lazy {
        DaggerApplicationGraph.builder().build()
    }

    fun applicationGraph()=applicationGraph
}