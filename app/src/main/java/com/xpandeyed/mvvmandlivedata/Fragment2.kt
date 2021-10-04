package com.xpandeyed.mvvmandlivedata

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class Fragment2 : Fragment() {

    private lateinit var myViewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_2, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myViewModel = ViewModelProvider(requireActivity()).get(MyViewModel::class.java)
        myViewModel.myLiveData.observe(viewLifecycleOwner, Observer{
            view.findViewById<TextView>(R.id.tvList).text = "$it"
        })
    }


}