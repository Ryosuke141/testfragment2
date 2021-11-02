package com.example.testfragment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class ButtonFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_button, container, false)
        view.findViewById<Button>(R.id.button).setOnClickListener{
            val listener = context as? OnButtonClickListener
            listener?.onButtonClicked()
        }
        return view
    }

    interface OnButtonClickListener{
        fun onButtonClicked()
    }

}