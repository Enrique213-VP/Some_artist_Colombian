package Colombia.android.svape.cantantes

import Colombia.android.svape.cantantes.databinding.ActivityMainBinding
import Colombia.android.svape.cantantes.databinding.ItemArtistListBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        binding.rvArtistColombian.layoutManager = LinearLayoutManager(this)
        val adapter = RecyclerAdapter(getArtist())
        binding.rvArtistColombian.adapter = adapter
    }

    private fun getArtist(): MutableList<Artist>{
        var Artist:MutableList<Artist> = mutableListOf()
        Artist.add( Artist("Rey del Despecho","Despecho","Dario Gomez","https://direct.rhapsody.com/imageserver/images/alb.160259647/600x600.jpg"))
        Artist.add(Artist("Alci Acosta", "Boleros", "Alciabiades acosta", "https://www.buenamusica.com/media/fotos/cantantes/biografia/alci-acosta.jpg"))
        Artist.add(Artist("Charrito Negro", "Despecho", "Johan Gabriel Gonzales", "https://www.lacantinadesergiozapata.com/inicio/wp-content/uploads/82517391_2618182695171802_4213637954196733952_o.jpg"))
        Artist.add(Artist("Alberto Posada", "Despecho", "Luis Alberto Posada", "https://caracoltv.brightspotcdn.com/dims4/default/f319f46/2147483647/strip/true/crop/507x452+0+0/resize/507x452!/quality/90/?url=http%3A%2F%2Fcaracol-brightspot.s3.amazonaws.com%2Fcb%2F6e%2Fc33e68534104b80fbfd2a756f1f5%2Fluis.JPG"))
        Artist.add(Artist("Helenita Vargas", "Despecho", "Sofía Helena Vargas", "https://i.ytimg.com/vi/n5_agdix_5c/hqdefault.jpg"))
        Artist.add(Artist("Granuja", "Rap", "Mateo Montaño", "https://heabbi.com/wp-content/uploads/2019/02/granuja-1.jpg"))
        Artist.add(Artist("Zeta zeta", "Rap", "zof ziro", "https://i.ytimg.com/vi/WwTUufK86f0/hqdefault.jpg"))
        Artist.add(Artist("Galy Galiano", "Romantica", "Carmelo Galiano Cotes", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTLQD3ulFzxO_8dphgHNE9Swy2Wv-23sdxNQ&usqp=CAU"))

        return Artist
    }
}