package com.example.test.ui.credits

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.test.R

class CreditsFragment : Fragment() {

    private lateinit var creditsFragmentModel: CreditsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        creditsFragmentModel =
            ViewModelProviders.of(this).get(CreditsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_info, container, false)
        return root
    }
}