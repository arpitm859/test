package com.example.test.ui.updates

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.test.R

class UpdatesFragment : Fragment() {

    private lateinit var UpdatesViewModel: UpdatesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        UpdatesViewModel =
            ViewModelProviders.of(this).get(UpdatesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_updates, container, false)
        return root
    }
}