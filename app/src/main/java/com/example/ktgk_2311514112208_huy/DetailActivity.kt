package com.example.ktgk_2311514112208_huy

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.example.ktgk_2311514112208_huy.databinding.DetailActivityBinding


class DetailActivity: AppCompatActivity() {

    private lateinit var b: DetailActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        b = DetailActivityBinding.inflate(layoutInflater)
        setContentView(b.root)
        val ten  = intent.getStringExtra("ten") ?: ""
        val tien  = intent.getDoubleExtra("tien",0.0)
        val ghichu = intent.getStringExtra("ghichu")?: ""

        if(ten.isEmpty()) Toast.makeText(this, "Thieu du lieu", Toast.LENGTH_SHORT).show()

        b.txttenkhoachi108.text = "Tên khoản chi: $ten"
        b.txtsotien108.text = "Số tiền: $tien"
        b.txtghichu108.text = "Ghi chú: $ghichu"

        b.btnedit108.setOnClickListener {
            Toast.makeText(this, "Dang tien hanh chinh sua", Toast.LENGTH_SHORT).show()
        }

        b.btnback108.setOnClickListener { finish() }
    }
}
