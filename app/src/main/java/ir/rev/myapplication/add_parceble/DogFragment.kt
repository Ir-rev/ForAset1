package ir.rev.myapplication.add_parceble

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import ir.rev.myapplication.R
import ir.rev.myapplication.old_way.Cat

class DogFragment : Fragment() {

    companion object {

        // добавив парсализацию упростили себе передачу данных
        private const val DOG_KEY = "DOG_KEY"

        fun newInstance(dog: Dog) = DogFragment().apply {
            // теперь смогли сразу класс передать в обьект
            arguments = Bundle().also {
                it.putParcelable(DOG_KEY, dog)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_dog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(view) {
            val dog = arguments?.getParcelable<Dog>(DOG_KEY) ?: return@with
            findViewById<TextView>(R.id.textview_name).text = dog.name
            findViewById<TextView>(R.id.textview_age).text = dog.age.toString()
        }
    }

}