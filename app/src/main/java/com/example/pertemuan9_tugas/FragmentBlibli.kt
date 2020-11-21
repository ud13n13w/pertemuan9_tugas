package com.example.pertemuan9_tugas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.pertemuan9_tugas.databinding.FragmentBlibliBinding

class FragmentBlibli : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentBlibliBinding>(inflater, R.layout.fragment_blibli,container,false)

        //OnClick
        binding.btnLanjutBlibli.setOnClickListener{ view : View -> view.findNavController().navigate(R.id.action_fgBlibli_to_fgHome) }
        return binding.root
    }

}