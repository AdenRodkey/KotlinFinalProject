package com.hfad.rodkey_cit382_finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class MenuFragment : Fragment() {
    val Generator = Generator()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val View = inflater.inflate(R.layout.fragment_menu, container, false)

        val Button = View.findViewById<Button>(R.id.button)

        Button.setOnClickListener {
            (activity as MainActivity ?) !!.ChangeFragment()
            }
        return View



    }

}