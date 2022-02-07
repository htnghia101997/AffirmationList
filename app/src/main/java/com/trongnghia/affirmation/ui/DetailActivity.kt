package com.trongnghia.affirmation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.trongnghia.affirmation.R

class DetailActivity : AppCompatActivity() {

    companion object {

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val affirmationString: String? = intent.extras?.getString("keyBundle")
        val tvAffirmationDetail: TextView = this.findViewById(R.id.tvAffirmationDetail)
        tvAffirmationDetail.text=affirmationString
    }


    override fun onResume() {
        super.onResume()
    }





    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}