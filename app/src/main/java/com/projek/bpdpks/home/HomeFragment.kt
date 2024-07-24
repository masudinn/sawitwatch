package com.projek.bpdpks.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.projek.bpdpks.R
import com.projek.bpdpks.analysis.AnalysisActivity
import com.projek.bpdpks.control.ControlActivity
import com.projek.bpdpks.databinding.FragmentHomeBinding
import com.projek.bpdpks.manage.HarvestActivity
import com.projek.bpdpks.pest.PestActivity
import com.projek.bpdpks.report.ReportActivity
import com.projek.bpdpks.schedule.ScheduleActivity


class HomeFragment : Fragment() {

    private var binding : FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.cardSchedule?.setOnClickListener {
            startActivity(Intent(context, ScheduleActivity::class.java))
        }
        binding?.cardAnalysis?.setOnClickListener {
            startActivity(Intent(context, AnalysisActivity::class.java))
        }
        binding?.cardControl?.setOnClickListener {
            startActivity(Intent(context, ControlActivity::class.java))
        }
        binding?.cardReport?.setOnClickListener {
            startActivity(Intent(context, ReportActivity::class.java))
        }
        binding?.cardManage?.setOnClickListener {
            startActivity(Intent(context, HarvestActivity::class.java))
        }
        binding?.cardPest?.setOnClickListener {
            startActivity(Intent(context, PestActivity::class.java))
        }
    }

}