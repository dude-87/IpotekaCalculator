package com.example.ipotekacalculator

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recycler: RecyclerView? = null

    var sumEdit: EditText? = null
    var percentEdit: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screen)
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        val view = super.onCreateView(name, context, attrs)
        recycler = view?.findViewById(R.id.main_screen_payments_list)
        sumEdit = view?.findViewById(R.id.main_screen_sum_input)
        percentEdit = view?.findViewById(R.id.main_screen_percent_input)
        return view
    }
}