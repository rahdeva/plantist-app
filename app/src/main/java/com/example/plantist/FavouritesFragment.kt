package com.example.plantist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FavouritesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_favourites, container, false)
    }

    companion object {
        fun newInstance() =
            FavouritesFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}