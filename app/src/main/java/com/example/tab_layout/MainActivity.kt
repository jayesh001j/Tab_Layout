package com.example.tab_layout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import layout.viewPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tablayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewpager = findViewById<ViewPager>(R.id.viewPager)
        var adapter = viewPagerAdapter(supportFragmentManager)

        //method 1
//        adapter.addFragment(ChatFragment(), "Chats")
//        adapter.addFragment(StatusFragment(), "Status")
//        adapter.addFragment(CallFragment(), "Call")

        viewpager.adapter = adapter
        tablayout.setupWithViewPager(viewpager)

        //method 2
        tablayout.getTabAt(0)?.text = "Chats"
        tablayout.getTabAt(1)?.text = "Status"
        tablayout.getTabAt(2)?.text = "Call"


//        //method 3
//        tablayout.addTab(tablayout.newTab().setText("Chats"))
//        tablayout.addTab(tablayout.newTab().setText("Status"))
//        tablayout.addTab(tablayout.newTab().setText("Call"))


    }
}