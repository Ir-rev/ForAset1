package ir.rev.myapplication.old_way

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import ir.rev.myapplication.R

class CatFragment : Fragment() {

    companion object {

        private const val NAME_KEY = "NAME_KEY"
        private const val AGE_KEY = "AGE_KEY"

        fun newInstance(cat: Cat) = CatFragment().apply {
            arguments = Bundle().also {
                it.putString(NAME_KEY, cat.name)
                it.putInt(AGE_KEY, cat.age)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_cat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(view){
            findViewById<TextView>(R.id.textview_name).text = arguments?.getString(NAME_KEY)
            findViewById<TextView>(R.id.textview_age).text = arguments?.getInt(AGE_KEY).toString()
        }
    }

}