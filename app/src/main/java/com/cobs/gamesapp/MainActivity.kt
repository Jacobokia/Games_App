package com.cobs.gamesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. Adapterview : Recycler(Cardview)
        val recyclerview:RecyclerView = findViewById(R.id.recyclerview)
        //recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerview.layoutManager = GridLayoutManager(this , 2)

        //2. data source: list of games objects
        var gamesList: ArrayList<GameModel> = ArrayList()

        var g1 = GameModel(R.drawable.card1, "Need for Speed")
        var g2 = GameModel(R.drawable.card2, "PES")
        var g3 = GameModel(R.drawable.card3, "HillClimbing")
        var g4 = GameModel(R.drawable.card4, "Fortnite")
        var g5 = GameModel(R.drawable.card5, "PUBG Mobile")
        var g6 = GameModel(R.drawable.card6, "Battle grounds")
        var g7 = GameModel(R.drawable.card4, "Fortnite")
        var g8 = GameModel(R.drawable.card5, "PUBG Mobile")
        var g9 = GameModel(R.drawable.card6, "Battle grounds")

        //3 . add them to the data source
        gamesList.add(g1)
        gamesList.add(g2)
        gamesList.add(g3)
        gamesList.add(g4)
        gamesList.add(g5)
        gamesList.add(g6)
        gamesList.add(g7)
        gamesList.add(g8)
        gamesList.add(g9)


        //4. adapter - connect to the data source
        val adapter = GameAdapter(gamesList)
        recyclerview.adapter = adapter
    }
}