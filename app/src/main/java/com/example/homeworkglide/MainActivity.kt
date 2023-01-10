package com.example.homeworkglide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private var counter = 0
    private val listImage = mutableListOf(
        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Haanja_2010_01_1.jpg/1280px-Haanja_2010_01_1.jpg",
        "https://klike.net/uploads/posts/2019-11/1574510006_2.jpg",
        "https://mirpozitiva.ru/wp-content/uploads/2019/11/1476433702_00.jpg",
        "https://static.mk.ru/upload/entities/2020/03/05/21/articles/detailPicture/9f/76/df/80/2e4d86c6869c2897f8ce624f34c71796.jpg",
        "https://emosurff.com/i/0006l000B39o/5aa377d9d7ed61a.jpg",
        "https://img.hotels24.ua/photos/ria/new_images/1123/112317/11231753/11231753m.jpg",
        "https://klike.net/uploads/posts/2018-12/medium/1544861697_2.jpg",
        "https://pibig.info/uploads/posts/2021-05/1622408922_46-pibig_info-p-priroda-zima-priroda-krasivo-foto-49.jpg",
        "https://klike.net/uploads/posts/2018-12/1544861778_1.jpg",
        "https://kartinkin.net/uploads/posts/2021-03/1616118885_12-p-zima-krasivie-foto-15.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            if (counter != 9) {
                findViewById<ImageView>(R.id.image).visibility = View.VISIBLE
                findViewById<TextView>(R.id.description).visibility = View.INVISIBLE
                getImage(listImage[counter])
                counter++
            } else {
                findViewById<ImageView>(R.id.image).visibility = View.INVISIBLE
                findViewById<TextView>(R.id.description).visibility = View.VISIBLE
                counter = 0
            }
        }
    }

    private fun getImage(url: String) {
        Glide.with(this)
            .load(url)
            .into(findViewById(R.id.image))
    }
}