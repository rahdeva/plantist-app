package com.example.plantist

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigation: MeowBottomNavigation
//    private var tanda = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation = findViewById(R.id.bottomNavigation)
        defaultFragment()

        bottomNavigation.add(MeowBottomNavigation.Model(0, R.drawable.ic_favorite))
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_home))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_about))

        bottomNavigation.setOnClickMenuListener {
            when(it.id){
                0 -> {
                    Toast.makeText(this, "Favourites", Toast.LENGTH_SHORT).show()
                    replaceFragment(FavouritesFragment.newInstance())
                }
                1 -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                    replaceFragment(HomeFragment.newInstance())
                }
                2 -> {
                    Toast.makeText(this, "About", Toast.LENGTH_SHORT).show()
                    replaceFragment(AboutFragment.newInstance())
                }
                else -> {
                    replaceFragment(HomeFragment.newInstance())
                }
            }
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.fragmentContainer,fragment).addToBackStack(Fragment::class.java.simpleName).commit()
    }

    private fun addFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.add(R.id.fragmentContainer,fragment).addToBackStack(Fragment::class.java.simpleName).commit()
    }

    private fun defaultFragment(){
        val tanda = intent.getStringExtra("flag")
        if(tanda == "1"){
            addFragment(AboutFragment.newInstance())
            bottomNavigation.show(2)
        }
        else{
            addFragment(HomeFragment.newInstance())
            bottomNavigation.show(1)
        }
    }
}