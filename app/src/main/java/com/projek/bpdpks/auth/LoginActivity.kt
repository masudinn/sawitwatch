package com.projek.bpdpks.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projek.bpdpks.DashboardActivity
import com.projek.bpdpks.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private var binding : ActivityLoginBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.tvRegister?.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        binding?.btnMasuk?.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }
    }
}