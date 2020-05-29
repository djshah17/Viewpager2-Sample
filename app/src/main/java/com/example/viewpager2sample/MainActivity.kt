package com.example.viewpager2sample

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.viewpager2sample.databinding.ActivityMainBinding

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        val listClubs = mutableListOf<Club>()
        listClubs.add(Club(R.drawable.premier_league,"Premier League","English Premier League or EPL",android.R.color.holo_purple))
        listClubs.add(Club(R.drawable.laliga,"La Liga","The Campeonato Nacional de Liga de Primera División",android.R.color.holo_orange_dark))
        listClubs.add(Club(R.drawable.bundesliga,"Bundesliga","Federal League",android.R.color.holo_red_dark))
        listClubs.add(Club(R.drawable.serie_a,"Serie A","Lega Nazionale Professionisti Serie A",android.R.color.holo_blue_dark))
        listClubs.add(Club(R.drawable.ligue_one,"Ligue 1","Ligue 1 Conforama",android.R.color.holo_orange_light))

        val adapter = ClubsAdapter(this@MainActivity, listClubs)
        binding.viewPagerMain.adapter = adapter

    }
}
