package com.example.mathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AddActivity : AppCompatActivity() {

    lateinit var randomNumbers : TextView
    lateinit var answerAdd : EditText
    lateinit var welcomeAndAnswer : TextView

    var firstNumber: Int = 0
    var secondNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        randomNumbers = findViewById(R.id.randomNumbers)
        welcomeAndAnswer = findViewById(R.id.welcomeAndAnswer)
        welcomeAndAnswer.text = "You want to add! Print your answer below and then press the button"

        showNewQuestion()


        answerAdd = findViewById(R.id.answerAdd)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            startAnswerActivity()
            showNewQuestion()
        }



    }


    fun checkAnswer() : Boolean {
        val answerText = answerAdd.text.toString()
        Log.d("Hej", "Input: $answerText")

        val answerInt = answerText.toIntOrNull()
        Log.d("Sanna", "Input: $answerInt")

        val rightAnswer = firstNumber + secondNumber

        return answerInt == rightAnswer



    }

    fun startAnswerActivity() {

        val answeredCorrect = checkAnswer()
        Log.d("!!!", "$answeredCorrect")
        if(answeredCorrect == true) {
            welcomeAndAnswer.text = "Rätt svar"
        } else {
            welcomeAndAnswer.text = "Fel svar"
        }
    }

    fun showNewQuestion() {
        firstNumber = (1..100).random()
        secondNumber= (1..100).random()

        randomNumbers.text = "$firstNumber + $secondNumber"

    }
}