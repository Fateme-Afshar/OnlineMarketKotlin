package com.utab.onlinemarketkotlin.view.fragment.splashScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.utab.onlinemarketkotlin.R
import com.utab.onlinemarketkotlin.databinding.MainLoadingViewBinding
import com.utab.onlinemarketkotlin.view.fragment.BaseFragment

class SplashFragment : BaseFragment() {
    private lateinit var binding: MainLoadingViewBinding
    private lateinit var splashVM: splashVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getFragmentView(inflater: LayoutInflater, container: ViewGroup?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.main_loading_view, container, false)
        return binding.root
    }
}