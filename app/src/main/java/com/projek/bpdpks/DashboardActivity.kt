package com.projek.bpdpks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import com.projek.bpdpks.analysis.AnalysisActivity
import com.projek.bpdpks.control.ControlActivity
import com.projek.bpdpks.databinding.ActivityDashboardBinding
import com.projek.bpdpks.home.HomeFragment
import com.projek.bpdpks.manage.HarvestActivity
import com.projek.bpdpks.pest.PestActivity
import com.projek.bpdpks.profil.ProfileFragment
import com.projek.bpdpks.report.ReportActivity
import com.projek.bpdpks.schedule.ScheduleActivity

class DashboardActivity : AppCompatActivity() {
    private var binding : ActivityDashboardBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val navView = findViewById<ChipNavigationBar>(R.id.nav_view)
        navView.setItemSelected(R.id.home, true)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, HomeFragment()).commit()
        bottomMenu(navView)
    }

    private fun bottomMenu(navView: ChipNavigationBar?) {
        navView?.setOnItemSelectedListener { i: Int ->
            var fragment : Fragment? = null
            when(i){
                R.id.home -> fragment = HomeFragment()
                R.id.profile -> fragment = ProfileFragment()
            }

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, fragment!!)
                .commit()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}