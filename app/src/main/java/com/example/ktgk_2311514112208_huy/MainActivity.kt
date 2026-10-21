package com.example.ktgk_2311514112208_huy

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ktgk_2311514112208_huy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnthem108.setOnClickListener {
            val ten = b.khoanchi108.text.toString().trim()
            val tien = b.sotien108.text.toString().trim()
            val ghichu = b.ghichu108.text.toString().trim()

            if(ten.isEmpty()) Toast.makeText(this, "Vui long nhap ten khoan chi", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "Da them khoan chi", Toast.LENGTH_SHORT).show()

        }
    }
}