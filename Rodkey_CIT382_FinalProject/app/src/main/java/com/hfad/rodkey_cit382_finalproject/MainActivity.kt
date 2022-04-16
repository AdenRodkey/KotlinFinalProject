package com.hfad.rodkey_cit382_finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val dictionary: MutableList<Word> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addWord("Run", "move at a speed faster than a walk")
        addWord("Run", "move a speed slower than a run")

        for(i in dictionary)
        {
            println("Word:" + i.word)
            println("Definition:" + i.definition)
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