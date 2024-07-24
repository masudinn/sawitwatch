package com.projek.bpdpks.profil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import com.projek.bpdpks.R
import com.projek.bpdpks.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var binding : FragmentProfileBinding? = null
    private val REQUEST_GALLERY = 1001
    private var dp : String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater, container, false)

        return binding?.root
    }

}