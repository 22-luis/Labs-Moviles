package com.example.laboratorio_06.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.viewModels
import com.example.laboratorio_06.R
import com.example.laboratorio_06.data.movies

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NewMovieFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NewMovieFragment : Fragment() {

    private lateinit var nameEditText : EditText
    private lateinit var categoryEditText : EditText
    private lateinit var descriptionEditText : EditText
    private lateinit var qualificationEditText : EditText
    private lateinit var submitButton: Button

    private val viewModel: MovieViewModel by viewModels()

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_movie, container, false)
        bind()
        addListeners()
    }

    private fun  bind() {
        nameEditText = view?.findViewById(R.id.editTextName) as EditText
        categoryEditText = view?.findViewById(R.id.editTextCategory) as EditText
        descriptionEditText = view?.findViewById(R.id.editTextDescription) as EditText
        qualificationEditText = view?.findViewById(R.id.editTextQualification) as EditText
        submitButton = view?.findViewById(R.id.btnSubmit) as Button
    }

    private fun addListeners(){
        submitButton.setOnClickListener {
            viewModel.getMovies(nameEditText, categoryEditText, descriptionEditText, qualificationEditText)
           // Log.d("NewMovieFragment", MovieViewModel.getMovies(movies).toString())
        }
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NewMovieFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NewMovieFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}