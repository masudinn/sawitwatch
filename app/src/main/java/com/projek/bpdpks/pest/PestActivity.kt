package com.projek.bpdpks.pest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projek.bpdpks.R
import com.projek.bpdpks.databinding.ActivityPestBinding

class PestActivity : AppCompatActivity() {
    private var binding : ActivityPestBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPestBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}