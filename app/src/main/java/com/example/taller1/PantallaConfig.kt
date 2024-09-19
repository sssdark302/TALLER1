package com.example.taller1

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class PantallaConfig : AppCompatActivity(){
    private lateinit var layout: RelativeLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutconfig)

        layout = findViewById(R.id.config)

        val radioGroupColors = findViewById<RadioGroup>(R.id.radioGroupColors)
        val buttonApplyColor = findViewById<Button>(R.id.buttonApplyColor)
        val buttonGoToHome = findViewById<Button>(R.id.buttonGoToHome)

        // Acción para aplicar el color de fondo
        buttonApplyColor.setOnClickListener {
            val selectedColor = when (radioGroupColors.checkedRadioButtonId) {
                R.id.radioButtonRed -> Color.RED
                R.id.radioButtonGreen -> Color.GREEN
                R.id.radioButtonBlue -> Color.BLUE
                else -> Color.WHITE
            }
            layout.setBackgroundColor(selectedColor)  // Cambia el color de fondo del layout
        }

        // Acción para volver a la pantalla de inicio
        buttonGoToHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}