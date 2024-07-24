package com.projek.bpdpks.manage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projek.bpdpks.databinding.ActivityHarvestBinding

class HarvestActivity : AppCompatActivity() {
    private var binding : ActivityHarvestBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHarvestBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}