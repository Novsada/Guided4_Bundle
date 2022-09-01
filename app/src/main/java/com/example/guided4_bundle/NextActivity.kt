package com.example.guided4_bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.ResourceBundle.getBundle

class NextActivity : AppCompatActivity() {
    private lateinit var nama : TextView
    private lateinit var nim  :TextView
    private lateinit var fakultas : TextView
    private lateinit var prodi : TextView
    private lateinit var mBundle: Bundle

    private lateinit var vNama: String
    private lateinit var vNim: String
    private lateinit var vFakultas:String
    private lateinit var vProdi:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        getBundle()
        setText()
    }
    private fun getBundle(){
        mBundle = intent.getBundleExtra("register")!!
        vNama = mBundle.getString("nama")!!
        vNim = mBundle.getString("nama")!!
        vFakultas = mBundle.getString("fakultas")!!
        vProdi = mBundle.getString("prodi")!!
    }

    private fun setText() {
        nama = findViewById(R.id.tvNama)
        nama.setText(vNama)
        nim = findViewById(R.id.tvNIM)
        nim.setText(vNim)
        fakultas = findViewById(R.id.tvFakultas)
        fakultas.setText(vFakultas)
        prodi = findViewById(R.id.tvProgamStudi)
        prodi.setText(vProdi)
    }
}