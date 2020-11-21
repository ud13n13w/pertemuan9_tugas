package com.example.pertemuan9_tugas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.pertemuan9_tugas.databinding.FragmentTokopediaBinding

class FragmentTokopedia : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentTokopediaBinding>(inflater, R.layout.fragment_tokopedia,container,false)

        //OnClick
        binding.btnLanjutTokopedia.setOnClickListener{ view : View -> view.findNavController().navigate(R.id.action_fgTokopedia_to_fgShopee) }
        return binding.root
    }

}