package com.desafiolatam.desafio3

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.desafiolatam.desafio3.base.BaseActivity
import com.desafiolatam.desafio3.base.BaseListener
import com.desafiolatam.desafio3.databinding.ActivitySecondBinding

class SecondActivity : BaseActivity<ActivitySecondBinding>(), BaseListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.appCompatImageView2.setOnClickListener(this)

    }

    override fun getViewBinding(): ActivitySecondBinding = ActivitySecondBinding.inflate(layoutInflater)

    override fun onClick(view: View?) {
        if (view != null){
            when(view.id) {
                R.id.appCompatImageView2 -> {
                    startActivity(Intent(this, MainActivity::class.java))
                }
            }
        }
    }
}