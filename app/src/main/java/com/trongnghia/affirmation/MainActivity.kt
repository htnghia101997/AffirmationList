package com.trongnghia.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.trongnghia.affirmation.adapter.ItemAdapter
import com.trongnghia.affirmation.model.Affirmation
import com.trongnghia.affirmation.model.ObjectListAffirmation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val objectListAffirmation: ObjectListAffirmation = ObjectListAffirmation()
        val sizeOfList: Int = objectListAffirmation.getListAffirmation().size
        val tvSize: TextView = this.findViewById(R.id.tvSize)
        tvSize.text = sizeOfList.toString()

        val list:List<Affirmation> = objectListAffirmation.getListAffirmation()

        val itemAdapter: ItemAdapter = ItemAdapter(this, list)
        val rcvAffirmation = findViewById<RecyclerView>(R.id.rcvAffirmation)

        rcvAffirmation.adapter = itemAdapter
        rcvAffirmation.setHasFixedSize(true)

        val listInput = mutableListOf(1, 2, 3, 4,5 , 6, 7, 8, 9)
        val listOuput = listInput.filter { it < 5 }

        val listOut = mutableListOf<Int>()
        listInput.forEach {
            if (it<5) {
                listOut.add(it)
            }
        }


    }
}