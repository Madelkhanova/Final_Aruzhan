package com.example.finalaru

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalaru.network.ApiClient
import com.example.finalaru.network.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A simple [Fragment] subclass.
 */
class CountriesFragment : Fragment() {
    private lateinit var textViewIn: TextView
    private lateinit var textViewUs: TextView

    private lateinit var textViewAu: TextView
    private lateinit var textViewRu: TextView
    private lateinit var textViewFr: TextView
    private lateinit var textViewGb: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_countries, container, false)
        textViewIn= rootView.findViewById(R.id.inD)
        textViewUs= rootView.findViewById(R.id.usA)
        textViewAu= rootView.findViewById(R.id.auS)
        textViewRu= rootView.findViewById(R.id.ruS)
        textViewFr= rootView.findViewById(R.id.frA)
        textViewGb= rootView.findViewById(R.id.gbA)

        textViewIn.setOnClickListener {
            val action = CountriesFragmentDirections.actionCountryToCategory()
            action.country = "in"
            view?.findNavController()?.navigate(action)
        }
        textViewUs.setOnClickListener {
            val action = CountriesFragmentDirections.actionCountryToCategory()
            action.country = "us"
            view?.findNavController()?.navigate(action)
        }
        textViewAu.setOnClickListener {
            val action = CountriesFragmentDirections.actionCountryToCategory()
            action.country = "au"
            view?.findNavController()?.navigate(action)
        }
        textViewRu.setOnClickListener {
            val action = CountriesFragmentDirections.actionCountryToCategory()
            action.country = "ru"
            view?.findNavController()?.navigate(action)
        }
        textViewFr.setOnClickListener {
            val action = CountriesFragmentDirections.actionCountryToCategory()
            action.country = "fr"
            view?.findNavController()?.navigate(action)
        }
        textViewGb.setOnClickListener {
            val action = CountriesFragmentDirections.actionCountryToCategory()
            action.country = "gb"
            view?.findNavController()?.navigate(action)
        }
        return rootView
    }
}