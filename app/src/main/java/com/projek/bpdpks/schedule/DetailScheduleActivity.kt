package com.projek.bpdpks.schedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projek.bpdpks.R
import com.projek.bpdpks.databinding.ActivityDetailScheduleBinding

class DetailScheduleActivity : AppCompatActivity() {
    private var binding : ActivityDetailScheduleBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailScheduleBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}