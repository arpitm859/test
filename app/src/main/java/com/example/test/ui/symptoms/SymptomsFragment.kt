package com.example.test.ui.symptoms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.test.R

class SymptomsFragment : Fragment() {

    private lateinit var symptomsViewModel: SymptomsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        symptomsViewModel =
            ViewModelProviders.of(this).get(SymptomsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_symptoms, container, false)
        return root
    }
}