package com.utab.onlinemarketkotlin.view.fragment.splashScreen

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupLoadProducts()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.main_loading_view, container, false)
        return binding.root
    }

    private fun setupLoadProducts() {
        splashVM.getNewestProducts().observe(this, {
            when (it.status) {
                Status.SUCCESS -> {
                    it.data?.let { it1 -> baseVm.setNewestProduct(it1) }
                    splashVM.flags()[0]=true
                }
                Status.ERROR -> Toast.makeText(activity, it.msg, Toast.LENGTH_LONG).show()
            }
        })

        splashVM.getBestProduct().observe(this, {
            when (it.status) {
                Status.SUCCESS -> {
                    it.data?.let { it1 -> baseVm.setBestProduct(it1) }
                    splashVM.flags()[1]=true
                }
                Status.ERROR -> Toast.makeText(activity, it.msg, Toast.LENGTH_LONG).show()
            }
        })

        splashVM.getPopulatedProduct().observe(this, {
            when (it.status) {
                Status.SUCCESS -> {
                    it.data?.let { it1 -> baseVm.setPopulatedProduct(it1) }
                    splashVM.flags()[2]=true
                }
                Status.ERROR -> Toast.makeText(activity, it.msg, Toast.LENGTH_LONG).show()
            }
        })

        splashVM.getSpecialProduct().observe(this, {
            when (it.status) {
                Status.SUCCESS -> {
                    it.data?.let { it1 -> baseVm.setSpecialProductList(it1) }
                    splashVM.flags()[3]=true
                }
                Status.ERROR -> Toast.makeText(activity, it.msg, Toast.LENGTH_LONG).show()
            }
        })
    }
}