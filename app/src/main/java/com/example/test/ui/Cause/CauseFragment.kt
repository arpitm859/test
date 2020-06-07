package com.example.test.ui.Cause

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.test.R

class CauseFragment : Fragment() {

    private lateinit var causeViewModel: CauseViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        causeViewModel =
            ViewModelProviders.of(this).get(CauseViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_cause, container, false)
        return root
    }
}