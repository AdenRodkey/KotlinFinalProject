package com.hfad.rodkey_cit382_finalproject

import android.os.Bundle
import android.provider.UserDictionary.Words.addWord
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


/**
 * A simple [Fragment] subclass.
 * Use the [Generator.newInstance] factory method to
 * create an instance of this fragment.
 */
class Generator : Fragment() {
    val dictionary: MutableList<Word> = mutableListOf()

    fun addWord(word : String, definition : String)
    {
        val tempWord = Word()
        tempWord.word = word
        tempWord.definition = definition
        dictionary.add(tempWord)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val View = inflater.inflate(R.layout.fragment_generator, container, false)
        val wordview = View.findViewById<TextView>(R.id.word)
        val defview = View.findViewById<TextView>(R.id.definition)
        val genbutton = View.findViewById<Button>(R.id.genbutton)
        val introview = View.findViewById<TextView>(R.id.intro)

        addWord("Run", "move at a speed faster than a walk")
        addWord("Walk", "move a speed slower than a run")

        introview.text = "Dictionary.IO"

        genbutton.setOnClickListener {
            for(i in dictionary)
            {
                wordview.text = i.word
                defview.text = i.definition
            }
        }

        // Inflate the layout for this fragment
        return View

    }

}
class Word
{
    var definition = ""
    var word = ""
}