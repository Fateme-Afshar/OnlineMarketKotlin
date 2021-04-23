package com.utab.onlinemarketkotlin.view.fragment.splashScreen

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.utab.onlinemarketkotlin.OnlineMarketApplication
import com.utab.onlinemarketkotlin.R
import com.utab.onlinemarketkotlin.databinding.MainLoadingViewBinding
import com.utab.onlinemarketkotlin.utils.networkUtils.Status
import com.utab.onlinemarketkotlin.view.fragment.BaseFragment
import javax.inject.Inject

class SplashFragment : BaseFragment() {
    private lateinit var binding: MainLoadingViewBinding

    @Inject
    lateinit var splashVM: SplashVM

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity?.application as OnlineMarketApplication).applicationGraph().inject(this)
    }

    override fun getFragmentView(inflater: LayoutInflater, container: ViewGroup?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.main_loading_view, container, false)
        return binding.root
    }
}