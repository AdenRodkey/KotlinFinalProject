package com.hfad.rodkey_cit382_finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val dictionary: MutableList<Word> = mutableListOf()
    val wordview = findViewById<TextView>(R.id.word)
    val defview = findViewById<TextView>(R.id.definition)
    val genbutton = findViewById<Button>(R.id.genbutton)
    val introview = findViewById<TextView>(R.id.intro)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addWord("Run", "move at a speed faster than a walk")
        addWord("Run", "move a speed slower than a run")

        introview.text = "Dictionary.IO"

        genbutton.setOnClickListener {
            for(i in dictionary)
            {
                wordview.text = i.word
                defview.text = i.definition
            }
        }


    }

    fun addWord(word : String, definition : String)
    {
        val tempWord = Word()
        tempWord.word = word
        tempWord.definition = definition
        dictionary.add(tempWord)
    }

}
class Word
{
    var definition = ""
    var word = ""
}