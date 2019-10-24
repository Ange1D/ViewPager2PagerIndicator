package com.Ange1D.viewpager2pagerindicator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.viewpager2.widget.ViewPager2
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        setupViewPager2()

    }

    private fun setupViewPager2() {
        val viewPager2 = findViewById<ViewPager2>(R.id.viewPager2)
        val dotsIndicator = findViewById<SpringDotsIndicator>(R.id.spring_dots_indicator)

        viewPager2.adapter = ViewPagerAdapter()
        dotsIndicator.setViewPager2(viewPager2)
    }
}
