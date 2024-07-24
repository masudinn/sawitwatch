package com.projek.bpdpks.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projek.bpdpks.R
import com.projek.bpdpks.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private var binding : ActivityRegisterBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnBack?.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}