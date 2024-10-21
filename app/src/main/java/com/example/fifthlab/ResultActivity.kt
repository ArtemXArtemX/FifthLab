package com.example.fifthlab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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

        val buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}
