package com.example.googleplay

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ArrayList<Item>()

        items.clear()
        items.add(Item("John wick", "4.1 *", R.drawable.a))
        items.add(Item("John wick", "4.1 *", R.drawable.b))
        items.add(Item("John wick", "4.1 *", R.drawable.c))
        items.add(Item("John wick", "4.1 *", R.drawable.d))
        items.add(Item("John wick", "4.1 *", R.drawable.e))
        items.add(Item("John wick", "4.1 *", R.drawable.f))
        items.add(Item("John wick", "4.1 *", R.drawable.g))
        items.add(Item("John wick", "4.1 *", R.drawable.h))
        items.add(Item("John wick", "4.1 *", R.drawable.a))
        items.add(Item("John wick", "4.1 *", R.drawable.b))
        items.add(Item("John wick", "4.1 *", R.drawable.c))
        items.add(Item("John wick", "4.1 *", R.drawable.d))
        items.add(Item("John wick", "4.1 *", R.drawable.e))
        items.add(Item("John wick", "4.1 *", R.drawable.f))
        items.add(Item("John wick", "4.1 *", R.drawable.g))
        items.add(Item("John wick", "4.1 *", R.drawable.h))

        // 01
        val recyclerView01 : RecyclerView = findViewById(R.id.recyclerView01)

        val lm01 = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView01.layoutManager = lm01
        recyclerView01.adapter = MyAdapter(applicationContext, items)

        // 02
        val recyclerView02 : RecyclerView = findViewById(R.id.recyclerView02)

        val lm02 = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView02.layoutManager = lm02
        recyclerView02.adapter = MyAdapter(applicationContext, items)

        // 03
        val recyclerView03 : RecyclerView = findViewById(R.id.recyclerView03)

        val lm03 = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView03.layoutManager = lm03
        recyclerView03.adapter = MyAdapter(applicationContext, items)

        // 04
        val recyclerView04 : RecyclerView = findViewById(R.id.recyclerView04)

        val lm04 = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView04.layoutManager = lm04
        recyclerView04.adapter = MyAdapter(applicationContext, items)

        // 05
        val recyclerView05 : RecyclerView = findViewById(R.id.recyclerView05)

        val lm05 = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView05.layoutManager = lm05
        recyclerView05.adapter = MyAdapter(applicationContext, items)
    }
}

class Item() {

    lateinit var name: String
    lateinit var rate: String
    var image: Int = 0

    constructor(name: String, rate: String, image: Int) : this() {
        this.name = name
        this.rate = rate
        this.image = image
    }
}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var imageView: ImageView
    var nameView: TextView
    var rateView: TextView

    init {
        imageView = itemView.findViewById(R.id.imageview)
        nameView = itemView.findViewById(R.id.name)
        rateView = itemView.findViewById(R.id.rate)
    }
}

class MyAdapter() : RecyclerView.Adapter<MyViewHolder>() {

    private lateinit var items: List<Item>
    private lateinit var context: Context

    constructor(context: Context, items: List<Item>) : this() {
        this.context = context
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.app_inner, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nameView.text = items[position].name
        holder.rateView.text = items[position].rate
        holder.imageView.setImageResource(items[position].image)
    }
}