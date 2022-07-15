package com.sirius.test_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/*class ReviewsAdapter (val reviews: Array<ReviewModel>):
    RecyclerView.Adapter<ReviewsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewsAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.review_item, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = reviews[position].userName

        holder.phoneNumber.text = reviews[position].phoneNumber
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val name: TextView = v
        val phoneNumber: TextView = v.phoneNumber
        val button: ImageView = v.sms
    }

    override fun getItemCount(): Int {
        return reviews.size
    }
}*/