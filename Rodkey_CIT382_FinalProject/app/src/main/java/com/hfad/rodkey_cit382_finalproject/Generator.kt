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
        var i = 0;

        addWord("Run", "move at a speed faster than a walk")
        addWord("Walk", "move at a speed slower than a run")
        addWord("Talk", "To verbalize thoughts.")
        addWord("Jog", "To move at a speed slower than a run, but faster than a walk.")
        addWord("Study", "To apply oneself to the acquisition of knowledge, as by reading, investigation, or practice.")
        addWord("Attend", "to go with as a concomitant or result; accompany")
        addWord("Bewilder", "To confuse or puzzle completely; perplex")
        addWord("Fascinate", "To arouse the interest or curiosity of")
        addWord("Book", "A work of fiction or nonfiction in an electronic format:")
        addWord("Indubitable", "That cannot be doubted; patently evident or certain; unquestionable.")



        introview.text = "Dictionary.IO"

        genbutton.setOnClickListener {
            if(i >= dictionary.size)
            {
                i = 0;
            }
                    introview.text = ""
                    wordview.text = dictionary.elementAt(i).word
                    defview.text = dictionary.elementAt(i).definition
                    i++

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