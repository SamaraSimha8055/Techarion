package com.example.techarion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    lateinit var homeImageView: ImageView
    lateinit var searchImageView: ImageView
    lateinit var notificationImageView: ImageView
    lateinit var profileImageView: ImageView
    lateinit var addImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        homeImageView = findViewById(R.id.home_image_view)
        searchImageView = findViewById(R.id.search_image_view)
        notificationImageView = findViewById(R.id.notify_image_view)
        profileImageView = findViewById(R.id.profile_image_view)
        addImageView = findViewById(R.id.add_image_View)

        homeImageView.setOnClickListener {
            val home = Home()
            homeFragment(home)
        }

        searchImageView.setOnClickListener{

            val search = Search()
            loadFragment(search)
        }

        notificationImageView.setOnClickListener {

            val notification = Notify()
            loadFragment(notification)
        }

        profileImageView.setOnClickListener {

            val profile = Profile()
            loadFragment(profile)
        }

        addImageView.setOnClickListener {

            val add = Add()
            loadFragment(add)
        }
    }

    private fun loadFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentView,fragment)
        fragmentTransaction.commit()
    }

    private fun homeFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentView,fragment)
        fragmentTransaction.commit()

    }
}