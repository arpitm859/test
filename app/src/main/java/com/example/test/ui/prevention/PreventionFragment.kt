package com.example.test.ui.prevention

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.test.R

class PreventionFragment : Fragment() {

    private lateinit var preventionViewModel: PreventionViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        preventionViewModel =
            ViewModelProviders.of(this).get(PreventionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_prevention, container, false)
        return root
    }
}