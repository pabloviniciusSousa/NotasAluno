package com.example.notasaluno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val EditNota1: EditText = findViewById(R.id.editNota1);
        val EditNota2: EditText = findViewById(R.id.editNota2);
        val EditNota3: EditText = findViewById(R.id.editNota3);
        val EditNota4: EditText = findViewById(R.id.editNota4);
        val TextResultado: TextView = findViewById(R.id.textResultado)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val nota1 = EditNota1.text.toString().toFloat()
            val nota2 = EditNota2.text.toString().toFloat()
            val nota3 = EditNota3.text.toString().toFloat()
            val nota4 = EditNota4.text.toString().toFloat()

            val media = (nota1 + nota2 + nota3 + nota4) / 4

            if(media >= 7){
                TextResultado.setText("Aprovado")
            }else{
                TextResultado.setText("Reprovado")
            }



               }

        }


}
