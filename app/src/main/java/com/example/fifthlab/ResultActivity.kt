package com.example.fifthlab

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        // Получаем переданную сумму
        val totalPrice = intent.getIntExtra("totalPrice", 0)

        // Отображаем результат
        textViewResult.text = "Оплатить = $totalPrice рублей"
    }
}
