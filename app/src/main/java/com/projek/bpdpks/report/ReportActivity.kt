package com.projek.bpdpks.report

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projek.bpdpks.R
import com.projek.bpdpks.databinding.ActivityReportBinding

class ReportActivity : AppCompatActivity() {
    private var binding : ActivityReportBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReportBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}