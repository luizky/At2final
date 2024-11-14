package br.unipar.at2final


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tela3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewViagens)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val viagens = listOf(
            Viagem("Viagem 1"),
            Viagem("Viagem 2"),
            Viagem("Viagem 3"),
            Viagem("Viagem 4"),
            Viagem("Viagem 5"),
            Viagem("Viagem 6")
        )

        recyclerView.adapter = ViagemAdapter(viagens)
    }
}
