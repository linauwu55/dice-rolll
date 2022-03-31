package com.ds.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
    val toast = Toast.makeText(this,"Rolou!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

class Dice(val numsides: Int){g
    fun roll () : Int{
        return (1..numsides).random()

    }
}

private fun rollDice() {
    val dice = Dice(6)
    val diceRoll = dice.roll()

    val diceImage: ImageView = findViewById(R.id.imageView)

    when (diceRoll) {
        1 -> diceImage.setImageResource(R.drawable.dice_1)
        2 -> diceImage.setImageResource(R.drawable.dice_2)
        3 -> diceImage.setImageResource(R.drawable.dice_3)
        4 -> diceImage.setImageResource(R.drawable.dice_4)
        5 -> diceImage.setImageResource(R.drawable.dice_5)
        6 -> diceImage.setImageResource(R.drawable.dice_6)
    }
        diceImage.contentDescription = diceRoll.toString()
}
}
