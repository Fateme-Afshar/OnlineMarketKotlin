package com.utab.onlinemarketkotlin.view.activity

import androidx.fragment.app.Fragment
import com.utab.onlinemarketkotlin.view.fragment.splashScreen.SplashFragment

class BaseActivity : SingleFragmentActivity() {
    override fun fragment(): Fragment {
        return SplashFragment()
    }
}