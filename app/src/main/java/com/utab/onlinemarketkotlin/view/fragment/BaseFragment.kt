package com.utab.onlinemarketkotlin.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return getFragmentView(inflater, container)
    }

    abstract fun getFragmentView(inflater: LayoutInflater, container: ViewGroup?): View
}