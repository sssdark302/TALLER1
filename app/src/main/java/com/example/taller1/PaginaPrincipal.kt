package com.example.taller1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PaginaPrincipal: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Asegúrate de referenciar el layout correcto (activity_main_principal)
        setContentView(R.layout.activity_main_principal)

        // Referencias a los elementos de la UI en activity_main_principal.xml
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val buttonSaveName = findViewById<Button>(R.id.buttonSaveName)
        val textViewName = findViewById<TextView>(R.id.textViewName)

        // Acción al presionar el botón de guardar nombre
        buttonSaveName.setOnClickListener {
            val name = editTextName.text.toString()
            textViewName.text = "Hola, $name"
        }
    }
}