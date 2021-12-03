package com.degalabs.wonderfulgarut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvDestinations: RecyclerView
    private var list: ArrayList<Destination> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDestinations = findViewById(R.id.rv_destinations)
        rvDestinations.setHasFixedSize(true)

        list.addAll(DestinationsData.listData)

        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvDestinations.layoutManager = LinearLayoutManager(this)
        val listDestinationAdapter = ListDestinationAdapter(list)
        rvDestinations.adapter = listDestinationAdapter

        listDestinationAdapter.setOnItemClickCallback(object :
            ListDestinationAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Destination) {
                showSelectedDestination(data)
            }
        })
    }

    private fun showSelectedDestination(destination: Destination) {
        val detailIntent = Intent(this@MainActivity, DetailActivity::class.java)
            .apply {
                putExtra(DetailActivity.EXTRA_IMG, destination.photo)
                putExtra(DetailActivity.EXTRA_NAME, destination.name)
                putExtra(DetailActivity.EXTRA_DESC, destination.detail)
                putExtra(DetailActivity.EXTRA_LOCATION, destination.location)
                putExtra(DetailActivity.EXTRA_RATING, destination.rating)
            }
        startActivity(detailIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }

        }
    }
}