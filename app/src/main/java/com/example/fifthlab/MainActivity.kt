package com.example.fifthlab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val editTextQuantity = findViewById<EditText>(R.id.editTextQuantity)
        val buttonCalculate = findViewById<Button>(R.id.buttonCalculate)

        buttonCalculate.setOnClickListener {
            val quantity = editTextQuantity.text.toString().toIntOrNull()

            if (quantity == null || quantity <= 0) {
                Toast.makeText(this, "Введите корректное количество", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Определение стоимости за фотографию в зависимости от выбранного формата
            val pricePerPhoto = when (radioGroup.checkedRadioButtonId) {
                R.id.radioButton9x12 -> 100
                R.id.radioButton10x15 -> 150
                R.id.radioButton18x24 -> 300
                else -> 0
            }

            val totalPrice = pricePerPhoto * quantity

            // Переход на вторую активность и передача суммы
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("totalPrice", totalPrice)
            startActivity(intent)
        }
    }
}


