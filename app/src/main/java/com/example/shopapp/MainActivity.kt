package com.example.shopapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        productAdapter = ProductAdapter(mutableListOf())


        productAdapter.addProduct(Product("asd","https://asd", "qweasdwad"))
        productAdapter.addProduct(Product("asd","https://asd", "qweasdwad"))
        productAdapter.addProduct(Product("asd","https://asd", "qweasdwad"))

        rvProducts.adapter = productAdapter
        rvProducts.layoutManager = LinearLayoutManager(this)

    }
}