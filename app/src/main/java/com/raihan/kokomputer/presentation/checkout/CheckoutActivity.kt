package com.raihan.kokomputer.presentation.checkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raihan.kokomputer.R
import com.raihan.kokomputer.databinding.ActivityCheckoutBinding

class CheckoutActivity : AppCompatActivity() {

    private val binding : ActivityCheckoutBinding by lazy {
        ActivityCheckoutBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}