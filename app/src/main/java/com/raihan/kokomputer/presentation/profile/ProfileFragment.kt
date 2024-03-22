package com.raihan.kokomputer.presentation.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.raihan.kokomputer.R
import com.raihan.kokomputer.databinding.FragmentHomeBinding
import com.raihan.kokomputer.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding =  FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}