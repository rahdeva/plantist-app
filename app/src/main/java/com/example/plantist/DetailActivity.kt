package com.example.plantist

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var imgbtnBackDetail : ImageButton
    private lateinit var ivPhoto: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvDetail: TextView
    private lateinit var tvDescription: TextView
    private lateinit var tvWaterInfo: TextView
    private lateinit var tvIlluminationInfo: TextView
    private lateinit var tvTemperatureInfo: TextView
    private lateinit var tvFertilizerInfo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        ivPhoto = findViewById(R.id.img_item_photo)
        tvName = findViewById(R.id.tv_item_name)
        tvDetail = findViewById(R.id.tv_item_detail)
        tvDescription = findViewById(R.id.tv_item_description)
        tvWaterInfo = findViewById(R.id.tv_item_info_water)
        tvIlluminationInfo = findViewById(R.id.tv_item_info_illumination)
        tvTemperatureInfo = findViewById(R.id.tv_item_info_temperature)
        tvFertilizerInfo = findViewById(R.id.tv_item_info_fertilizer)

        imgbtnBackDetail = findViewById(R.id.back_button)
        imgbtnBackDetail.setOnClickListener(this)

        val plants_name = intent.getStringExtra("plants_name")
        val plants_photo = intent.extras!!.getInt("plants_photo")
        val plants_detail = intent.getStringExtra("plants_detail")
        val plants_description = intent.getStringExtra("plants_description")
        val plants_water = intent.getStringExtra("plants_water")
        val plants_illumination = intent.getStringExtra("plants_illumination")
        val plants_temperature = intent.getStringExtra("plants_temperature")
        val plants_fertilizer = intent.getStringExtra("plants_fertilizer")

        Glide.with(this)
            .load(plants_photo)
            .apply(RequestOptions().override(1600, 1600))
            .into(ivPhoto)

//        ivPhoto.setImageResource(plants_photo)
        tvName.setText(plants_name)
        tvDetail.setText(plants_detail)
        tvDescription.setText(plants_description)
        tvWaterInfo.setText(plants_water)
        tvIlluminationInfo.setText(plants_illumination)
        tvTemperatureInfo.setText(plants_temperature)
        tvFertilizerInfo.setText(plants_fertilizer)


    }

    override fun onClick(v: View?) {
        val backdetailIntent = Intent(this,MainActivity::class.java)
        startActivity(backdetailIntent)
    }
}