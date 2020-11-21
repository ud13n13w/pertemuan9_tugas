package com.example.pertemuan9_tugas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.pertemuan9_tugas.databinding.FragmentShopeeBinding

class FragmentShopee : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentShopeeBinding>(inflater, R.layout.fragment_shopee,container,false)

        //OnClick
        binding.btnLanjutShopee.setOnClickListener{ view : View -> view.findNavController().navigate(R.id.action_fgShopee_to_fgBlibli) }
        return binding.root
    }

}