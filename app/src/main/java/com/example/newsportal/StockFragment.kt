package com.example.newsportal

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StockFragment : Fragment() {

    private lateinit var mRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_stock, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mRecyclerView = view.findViewById(R.id.stock_recycle_view)
        mRecyclerView.layoutManager = LinearLayoutManager(context)

    }

    override fun onStart() {
        super.onStart()

        val stockList = StockDatabase.findAll().shuffled()
        val stockAdapter = StockAdapter(stockList)
        mRecyclerView.adapter = stockAdapter
        stockAdapter.notifyDataSetChanged()
    }

}