package com.projek.bpdpks.schedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projek.bpdpks.R
import com.projek.bpdpks.databinding.ActivityAddScheduleBinding

class AddScheduleActivity : AppCompatActivity() {
    private var binding : ActivityAddScheduleBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddScheduleBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}