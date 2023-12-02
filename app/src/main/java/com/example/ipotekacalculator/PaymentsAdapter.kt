package com.example.ipotekacalculator

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PaymentsAdapter(private val items: List<PaymentItem>): RecyclerView.Adapter<PaymentHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.payments_list_item, parent, false)
        return PaymentHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: PaymentHolder, position: Int) {
        holder.bind(items[position])
    }
}