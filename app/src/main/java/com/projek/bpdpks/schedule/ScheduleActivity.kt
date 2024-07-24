package com.projek.bpdpks.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projek.bpdpks.R
import com.projek.bpdpks.databinding.ActivityScheduleBinding

class ScheduleActivity : AppCompatActivity() {
    private var binding : ActivityScheduleBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScheduleBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding!!.addDevices.setOnClickListener {
            startActivity(Intent(this, AddScheduleActivity::class.java))
        }
    }
}