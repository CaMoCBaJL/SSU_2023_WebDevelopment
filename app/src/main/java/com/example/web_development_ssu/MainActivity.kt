package com.example.web_development_ssu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val baaa = listOf(
        "Item0",
        "Item1",
        "Item2",
        "Item3",
        "Item4",
        "Item5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListAdapter();
    }

    private fun setListAdapter() {
        val listView: ListView = findViewById (R.id.listView);
        val adapter:ListAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, getListData());

        listView.adapter = adapter;
    }

    fun getListData(): List<String> {
        return baaa;
    }
}