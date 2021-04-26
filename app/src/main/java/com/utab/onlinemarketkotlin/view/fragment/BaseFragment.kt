package com.utab.onlinemarketkotlin.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import javax.inject.Inject

 open class BaseFragment : Fragment() {
    @Inject
    lateinit var baseVm: BaseVm

}