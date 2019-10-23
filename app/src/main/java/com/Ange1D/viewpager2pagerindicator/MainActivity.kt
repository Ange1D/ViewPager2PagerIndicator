package com.Ange1D.viewpager2pagerindicator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val springDotsIndicator = findViewById<WormDotsIndicator>(R.id.spring_dots_indicator)
        val viewPager2 = findViewById<ViewPager2>(R.id.viewPager2)
        val adapter = ViewPagerAdapter()
        viewPager2.adapter = adapter
        springDotsIndicator.setViewPager2(viewPager2)


    }
}
