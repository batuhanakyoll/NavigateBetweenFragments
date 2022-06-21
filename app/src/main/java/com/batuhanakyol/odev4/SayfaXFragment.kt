package com.batuhanakyol.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.batuhanakyol.odev4.databinding.FragmentAnasayfaBinding
import com.batuhanakyol.odev4.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {
     private lateinit var binding: FragmentSayfaXBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding =FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.buttonX.setOnClickListener{

            Navigation.findNavController(it).navigate(R.id.xySayfasiGecis)
        }


        return binding.root
    }

}