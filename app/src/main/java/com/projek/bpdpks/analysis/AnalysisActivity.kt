package com.projek.bpdpks.analysis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projek.bpdpks.R
import com.projek.bpdpks.databinding.ActivityAnalysisBinding

class AnalysisActivity : AppCompatActivity() {
    private var binding : ActivityAnalysisBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalysisBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}