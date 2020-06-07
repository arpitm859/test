package com.example.test.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.test.R

class InfoFragment : Fragment() {

    private lateinit var infoFragmentModel: InfoFragmentModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        infoFragmentModel =
            ViewModelProviders.of(this).get(InfoFragmentModel::class.java)
        val root = inflater.inflate(R.layout.fragment_info, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        infoFragmentModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}