package ru.netology.nmedia.ui


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R
@SuppressLint("SetTextI18n")
class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = findViewById<StatsView>(R.id.stats)
        view.data = listOf(
            500F,
            500F,
            500F,
            500F,
        )

    }
}