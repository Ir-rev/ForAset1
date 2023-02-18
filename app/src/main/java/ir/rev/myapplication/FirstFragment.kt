package ir.rev.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import ir.rev.myapplication.add_parceble.Dog
import ir.rev.myapplication.old_way.Cat

class FirstFragment : Fragment() {

    companion object {
        fun newInstance() = FirstFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_kyzya).setOnClickListener {
            (activity as? MainActivity)?.openCatFragment(
                Cat(
                    name = "Кузя",
                    age = 4
                )
            )
        }
        view.findViewById<Button>(R.id.button_semen).setOnClickListener {
            (activity as? MainActivity)?.openCatFragment(
                Cat(
                    name = "Семен",
                    age = 1
                )
            )
        }
        view.findViewById<Button>(R.id.button_bobik).setOnClickListener {
            (activity as? MainActivity)?.openDogFragment(
                Dog(
                    name = "бобик",
                    age = 3
                )
            )
        }
        view.findViewById<Button>(R.id.button_bylka).setOnClickListener {
            (activity as? MainActivity)?.openDogFragment(
                Dog(
                    name = "булка",
                    age = 5
                )
            )
        }
    }

}