package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }

    private var title: String = "Mode List"

    private lateinit var rvHeroes: RecyclerView
    private var list: ArrayList<Pirate> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportActionBar?.title = "Straw Hat Pirates"
        setActionBarTitle(title)

        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        list.addAll(PiratesData.listData)
        showRecyclerList()

    }


    // memanggil fasilitas menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    // pindah menu action / Metode setMode
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }

            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }

            R.id.action_cardview -> {
                title = "Mode CardView"
                showRecyclerView()
            }
        }
        setActionBarTitle(title)

    }

    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListPirateAdapter(list)
        rvHeroes.adapter = listHeroAdapter
    }

    // Menambahkan metode grid
    private fun showRecyclerGrid() {
        rvHeroes.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = GridPirateAdapter(list)
        rvHeroes.adapter = gridHeroAdapter
    }

    private fun showRecyclerView(){
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val cardViewPirateAdapter = CardViewPirateAdapter(list)
        rvHeroes.adapter = cardViewPirateAdapter
    }

}