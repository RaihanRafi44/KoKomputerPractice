package com.raihan.kokomputer.presentation.detailproduct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raihan.kokomputer.R
import com.raihan.kokomputer.databinding.ActivityCheckoutBinding
import com.raihan.kokomputer.databinding.ActivityDetailProductBinding

class DetailProductActivity : AppCompatActivity() {

    private val binding : ActivityDetailProductBinding by lazy {
        ActivityDetailProductBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}