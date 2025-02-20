package com.example.newsportal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class StockAdapter(private var stockList: List<Stock>): Adapter<StockAdapter.StockViewHolder>() {

    class StockViewHolder(view: View): ViewHolder(view) {
        val context: Context = view.context
        val symbol = view.findViewById<TextView>(R.id.item_stock_symbol)
        val name = view.findViewById<TextView>(R.id.item_stock_name)
        val price = view.findViewById<TextView>(R.id.item_stock_price)
        val variation = view.findViewById<TextView>(R.id.item_stock_variation)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StockViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_stock, parent, false)

        return StockViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: StockViewHolder,
        position: Int
    ) {
        holder.symbol.text = stockList[position].symbol
        holder.name.text = stockList[position].name
        holder.price.text = stockList[position].price.toString()
        holder.variation.text = stockList[position].variation.toString()

        if(stockList[position].variation >= 0) {
            holder.variation.setTextColor(holder.context.getColor(R.color.positive_variation_color))
        } else {
            holder.variation.setTextColor(holder.context.getColor(R.color.negative_variation_color))
        }
    }

    override fun getItemCount(): Int = stockList.size


}