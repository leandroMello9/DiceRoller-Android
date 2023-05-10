package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

	private lateinit  var diceImage: ImageView
	private lateinit var diceImageTwo: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
		diceImage = findViewById(R.id.dice_image)
		diceImageTwo = findViewById(R.id.dice_image_two)
		val rollButton: Button = findViewById(R.id.roll_button)
		//val countUpButton: Button = findViewById(R.id.count_up_button)

		rollButton.setOnClickListener{ rollDice() }
		//countUpButton.setOnClickListener({ countUp() })


    }
	private fun rollDice() {
		val randomDiceImage = getRandomDiceImage();
		diceImage.setImageResource(randomDiceImage)
		val randomDiceTwo = getRandomDiceImage()
		diceImageTwo.setImageResource(randomDiceTwo)
	}
	private fun getRandomDiceImage() : Int {
		val randomInt = (1..6).random()

		val drawableResource = when (randomInt) {
			1 -> R.drawable.dice_1
			2 -> R.drawable.dice_2
			3 -> R.drawable.dice_3
			4 -> R.drawable.dice_4
			5 -> R.drawable.dice_5
			else -> R.drawable.dice_6
		}
		return drawableResource

	}

	//private fun countUp() {
		//val resultText: TextView = findViewById(R.id.result_text)
		//val currentValue: String = resultText.text.toString()
		//val valueCurrentCountUp = currentValue.toInt() + 1
		//resultText.text = valueCurrentCountUp.toString()
	//}
}
