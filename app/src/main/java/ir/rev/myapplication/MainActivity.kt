package ir.rev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.rev.myapplication.add_parceble.Dog
import ir.rev.myapplication.add_parceble.DogFragment
import ir.rev.myapplication.old_way.Cat
import ir.rev.myapplication.old_way.CatFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FirstFragment.newInstance())
                .commit()
        }
    }

    fun openCatFragment(cat: Cat) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, CatFragment.newInstance(cat = cat))
            .addToBackStack(null)
            .commit()
    }

    fun openDogFragment(dog: Dog){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, DogFragment.newInstance(dog = dog))
            .addToBackStack(null)
            .commit()
    }

}