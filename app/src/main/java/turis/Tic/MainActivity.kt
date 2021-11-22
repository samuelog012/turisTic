package turis.Tic

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import turis.Tic.databinding.ActivityMainBinding
//import com.example.My_Application.databinding.ActivityMainBinding
import javax.net.ssl.SSLSessionBindingEvent



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.b, R.drawable.o, R.drawable.j

        )
        val name = arrayOf(

            "Murallas de Cartagena", "Museo del Oro Zenú", "Jardín Botánico Guillermo Piñeres"
        )

        val description = arrayOf(

            "Cuatro siglos de historia guarda este muro de 11 kilómetros de mineral marino ubicado en el Centro Histórico. Es La fortificación más completa del continente de América del Sur y una de las mejores y bien conservadas murallas de las ciudades amuralladas del mundo.",
            "Se encuentra ubicado en el Centro Histórico, frente a la Plaza de Bolívar. Fue inaugurado por el Banco de la República y en 1982 abrió sus puertas al público en Cartagena de Indias, con una colección de piezas en oro y cerámica de las principales culturas precolombinas.",
            "Con un agradable clima tropical húmedo, el Jardín Botánico Guillermo Piñeres es el lugar ideal para los amantes de la naturaleza que buscan un entorno natural. Para disfrutar de este paraíso ecológico se realiza una caminata de una hora."
        )

        val address = arrayOf(

            "Cartagena de Indias, Provincia de Cartagena, Bolívar",
            "Carrera 4 #33-60 Calle del Landrinal, Edificio del Banco de la República, Cartagena de Indias, Bolívar",
            "Sector Matute km 9 Autopista I-90, Naranjas, Turbaco, Bolívar"
        )

        val country = arrayOf(

            "Colombia", "Colombia", "Colombia"
        )


        userArrayList = ArrayList()


        for (i in name.indices) {

            val user = User(name[i], description[i], address[i], country[i], imageId[i])
            userArrayList.add(user)

        }


        binding.listView.isClickable = true
        binding.listView.adapter = Adapter(this, userArrayList)
        binding.listView.setOnItemClickListener { _, _, position, _ ->

            val name2 = name[position]
            val description2 = description[position]
            //val address2 = address[position]
            val imageId2 = imageId[position]
            val country2 = country[position]


            var i = Intent(this, UserActivity::class.java)

            i.putExtra("name", name2)
            i.putExtra("description", description2)
            //i.putExtra("address", address2)
            i.putExtra("imageId", imageId2)
            i.putExtra("country", country2)
            startActivity(i)


        }






    }
}