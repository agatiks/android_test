package com.sirius.test_app

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.chip.Chip
import com.sirius.test_app.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dm = DataModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Picasso
            .get()
            .load(dm.image)
            .error(R.drawable.ic_launcher_background)
            .into(binding.image)
        binding.name.text = dm.name
        Picasso
            .get()
            .load(dm.logo)
            .error(R.mipmap.ic_launcher)
            .into(binding.icon)

        for (i in 0 until dm.tags.size) {
            val chip = Chip(this)
            chip.text = dm.tags[i]
            /*chip.background = resources.getColor(R.color.chip_bg)
            chip.setChipBackgroundColorResource(R.color.chip_bg)
            chip.chipBackgroundColor = ColorStateList.valueOf(resources.getColor(R.color.chip_bg))*/
            chip.setTextColor(resources.getColor(R.color.chip_text))
            binding.chips.addView(chip)
        }
        binding.rating.rating = dm.rating
        binding.rating1.rating = dm.rating
        binding.ratingValue.text = dm.rating.toString()
        binding.reviewsValue.text = "${dm.reviews} reviews" ///todo:
        binding.description.text = dm.description
    }
}