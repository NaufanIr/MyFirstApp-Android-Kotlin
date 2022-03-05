package com.example.myfirstapp.listPahlawan

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.R
import com.example.myfirstapp.listPahlawan.data.Hero

class ListPahlawan : AppCompatActivity() {

    private lateinit var rvHeroes: RecyclerView
    private val heroes = ArrayList<Hero>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pahlawan)

        rvHeroes = findViewById(R.id.rv_heroes)
        heroes.addAll(listHeroes)
        showRecyclerList()
    }

    private val listHeroes: ArrayList<Hero>
        get() {
            val dataName = resources.getStringArray(R.array.heroes_name)
            val dataDescription = resources.getStringArray(R.array.heroes_description)
            val dataPhoto = resources.getStringArray(R.array.heroes_photo)
            val listHero = ArrayList<Hero>()
            for (i in dataName.indices) {
                val hero = Hero(name =  dataName[i], desc =  dataDescription[i], img = dataPhoto[i])
                listHero.add(hero)
            }
            return listHero
        }

    private fun showRecyclerList() {
        //rvHeroes.layoutManager = GridLayoutManager(this, 2)
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(heroes)
        rvHeroes.adapter = listHeroAdapter
    }
}