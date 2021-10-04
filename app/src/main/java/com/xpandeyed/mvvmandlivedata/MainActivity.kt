package com.xpandeyed.mvvmandlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentOne = FragmentOne()
        val fragmentTwo = Fragment2()


        setCurrentFragment(fragmentOne)
        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        findViewById<Button>(R.id.bChangeFragment).setOnClickListener {
            setCurrentFragment(fragmentTwo)
        }
    }
    private fun setCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flContainer, fragment)
            commit()
        }
    }
}