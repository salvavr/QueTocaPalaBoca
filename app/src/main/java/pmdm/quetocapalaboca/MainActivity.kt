package pmdm.quetocapalaboca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val listaPlatos = arrayListOf("Serranito","Perrito","Hamburguesa","Pizza","Montadito","Brocheta")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valQueSePedira = findViewById<TextView>(R.id.queSePedira)
        val valtxtQueSePedira = findViewById<EditText>(R.id.txtQueSePedira)
        val valBtnPlato = findViewById<Button>(R.id.btnPlato)
        val valBtnAleat = findViewById<Button>(R.id.btnAleat)

        valBtnAleat.setOnClickListener{
            val platoAleatorio = Random.nextInt(listaPlatos.count())
            valQueSePedira.text = listaPlatos[platoAleatorio]
        }

        valBtnPlato.setOnClickListener{
            val nuevoPlato = valtxtQueSePedira.text.toString()
            listaPlatos.add(nuevoPlato)
            valtxtQueSePedira.text.clear()
        }
    }
}