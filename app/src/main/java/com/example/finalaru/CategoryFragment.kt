package com.example.finalaru

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

class CategoryFragment : Fragment() {
    private lateinit var textViewBusin: TextView
    private lateinit var textViewEntertain: TextView

    private lateinit var textViewGen: TextView
    private lateinit var textViewHealth: TextView
    private lateinit var textViewScience: TextView
    private lateinit var textViewSports: TextView
    private lateinit var textViewTech: TextView
    val args: CategoryFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_category, container, false)
        textViewBusin = rootView.findViewById(R.id.business)
        textViewEntertain = rootView.findViewById(R.id.entertain)
        textViewHealth = rootView.findViewById(R.id.health)
        textViewGen = rootView.findViewById(R.id.general)
        textViewScience = rootView.findViewById(R.id.science)
        textViewSports = rootView.findViewById(R.id.sports)
        textViewTech = rootView.findViewById(R.id.technology)

        textViewBusin.setOnClickListener {
            val action = CategoryFragmentDirections.actionCategoryToNews()
            action.country = args.country
            action.category = "business"
            view?.findNavController()?.navigate(action)
        }
        textViewEntertain.setOnClickListener {
            val action = CategoryFragmentDirections.actionCategoryToNews()
            action.country = args.country
            action.category = "entertainment"
            view?.findNavController()?.navigate(action)
        }
        textViewGen.setOnClickListener {
            val action = CategoryFragmentDirections.actionCategoryToNews()
            action.country = args.country
            action.category = "general"
            view?.findNavController()?.navigate(action)
        }
        textViewHealth.setOnClickListener {
            val action = CategoryFragmentDirections.actionCategoryToNews()
            action.country = args.country
            action.category = "health"
            view?.findNavController()?.navigate(action)
        }
        textViewScience.setOnClickListener {
            val action = CategoryFragmentDirections.actionCategoryToNews()
            action.country = args.country
            action.category = "science"
            view?.findNavController()?.navigate(action)
        }
        textViewSports.setOnClickListener {
            val action = CategoryFragmentDirections.actionCategoryToNews()
            action.country = args.country
            action.category = "sports"
            view?.findNavController()?.navigate(action)
        }
        textViewTech.setOnClickListener {
            val action = CategoryFragmentDirections.actionCategoryToNews()
            action.country = args.country
            action.category = "technology"
            view?.findNavController()?.navigate(action)
        }
        return rootView
    }

}