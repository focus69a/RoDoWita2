package com.onegday.pl33111.rodowita2


import android.content.Context
import android.content.ServiceConnection
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.support.constraint.Placeholder
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.view.View
import android.view.ViewGroup
import android.widget.*
import java.text.FieldPosition
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.support.design.widget.TabLayout
import android.support.design.widget.Snackbar
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_o_programie.*
import kotlinx.android.synthetic.main.fragment_upowaznienia_prywatne.*
import kotlinx.android.synthetic.main.fragment_zgody_firmowe.*




class MainActivity : AppCompatActivity() {


    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewpagerID) as ViewPager

        setupViewPager(viewPager)

        tabLayout = findViewById(R.id.tabLayoutID) as TabLayout

        tabLayout.setupWithViewPager(viewPager)


        //val listaUpowaznien = findViewById<ListView>(R.id.listaID)
        //listaUpowaznien.adapter = MyCustomAdapter(this)  // moj adapter do zasilania listy upowaznien

    }

    private fun setupViewPager(viewPager: ViewPager) {
        var adapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(UpowaznieniaPrywatneActivity(), "UPOWAŻNIENIA PRYWATNE")
        adapter.addFragment(ZgodyFirmoweActivity(), "ZGODY FIRMOWE")
        adapter.addFragment(OProgramieActivity(), "O PROGRAMIE")

        viewPager.adapter = adapter

    }


    //====================================================================================

}
