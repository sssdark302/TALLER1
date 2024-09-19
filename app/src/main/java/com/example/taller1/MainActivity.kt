package com.example.taller1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.taller1.ui.theme.TALLER1Theme
import java.util.Calendar

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia al TextView para mostrar el saludo
        val textViewGreeting = findViewById<TextView>(R.id.textViewGreeting)

        // Asignar el saludo personalizado basado en la hora del día
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)

        val greeting = when (hour) {
            in 0..11 -> "Buenos días"
            in 12..17 -> "Buenas tardes"
            else -> "Buenas noches"
        }

        // Mostrar el saludo en el TextView
        textViewGreeting.text = greeting

        // Referencia al botón para ir a la Actividad Principal
        val buttonGoToMain = findViewById<Button>(R.id.buttonGoToMain)

        // Asignar la acción de navegar a la Actividad Principal al presionar el botón
        buttonGoToMain.setOnClickListener {
            // Crear un Intent para abrir la Actividad Principal
            val intent = Intent(this, PaginaPrincipal::class.java)
            startActivity(intent)
        }
    }
}