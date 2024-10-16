package com.desafiolatam.desafio3

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.desafiolatam.desafio3.base.BaseActivity
import com.desafiolatam.desafio3.base.BaseListener
import com.desafiolatam.desafio3.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(), BaseListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        //binding.cardView2.setOnClickListener(this)
        binding.cardView3.setOnClickListener(this)
        binding.cardView4.setOnClickListener(this)
        binding.cardView5.setOnClickListener(this)


        binding.cardView1.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }
        binding.cardView2.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun onClick(view: View?) {
        if (view != null){
            when(view.id)
            {
                R.id.cardView3 -> {
                    startActivity(Intent(this, ThirdActivity::class.java))
                }
                R.id.cardView4 -> {
                    startActivity(Intent(this, FourthActivity::class.java))
                }
                R.id.cardView5 -> {
                    startActivity(Intent(this, FifthActivity::class.java))
                }
            }
        }

    }

}