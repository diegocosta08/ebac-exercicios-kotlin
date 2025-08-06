package com.diego.primeiroapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var numClicks = 0
    private val imagensFundo = listOf(R.drawable.fundo1, R.drawable.fundo2, R.drawable.fundo3)
    private var indiceImagemAtual = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutPrincipal = findViewById<RelativeLayout>(R.id.layoutPrincipal)
        val editNome = findViewById<EditText>(R.id.editNome)
        val buttonTrocarImagem = findViewById<Button>(R.id.botaoTrocar)
        val textViewInfo = findViewById<TextView>(R.id.textMensagem)

        buttonTrocarImagem.setOnClickListener {
            // Incrementa o contador
            numClicks++

            // Troca a imagem de fundo
            indiceImagemAtual = (indiceImagemAtual + 1) % imagensFundo.size
            layoutPrincipal.setBackgroundResource(imagensFundo[indiceImagemAtual])

            // Pega o nome digitado
            val nome = editNome.text.toString()

            // Atualiza o TextView
            textViewInfo.text = "Nome: $nome\nNúmero de cliques: $numClicks"
        }
    }
}