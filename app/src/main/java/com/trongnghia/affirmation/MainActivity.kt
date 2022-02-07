package com.trongnghia.affirmation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.trongnghia.affirmation.adapter.ItemAdapter
import com.trongnghia.affirmation.model.Affirmation
import com.trongnghia.affirmation.model.ObjectListAffirmation
import com.trongnghia.affirmation.ui.DetailActivity

class MainActivity : AppCompatActivity() {

    companion object {

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val objectListAffirmation: ObjectListAffirmation = ObjectListAffirmation()
        val sizeOfList: Int = objectListAffirmation.getListAffirmation().size
        val tvSize: TextView = this.findViewById(R.id.tvSize)
        tvSize.text = sizeOfList.toString()

        tvSize.setOnClickListener {

        }

        val list:List<Affirmation> = objectListAffirmation.getListAffirmation()

        val itemAdapter: ItemAdapter = ItemAdapter(context = this,
            listAffirmationAdapter=list,
            onClickCallback = ItemAdapter.OnClickCallback {
            handleOnClick(it)
        } )
        val rcvAffirmation = findViewById<RecyclerView>(R.id.rcvAffirmation)

        rcvAffirmation.adapter = itemAdapter
        rcvAffirmation.setHasFixedSize(true)

//


    }
    fun handleOnClick(getDataCallback:String){


        // start a new activityt
        // pass data to new activity
        val intent: Intent = Intent(this, DetailActivity::class.java)
        val bundle: Bundle = Bundle()
        bundle.putString("keyBundle", getDataCallback)
        intent.putExtras(bundle)




        this.startActivity(intent)

//        Toast.makeText(this,getDataCallback,Toast.LENGTH_SHORT).show()

    }
}