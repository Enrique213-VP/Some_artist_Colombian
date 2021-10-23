package Colombia.android.svape.cantantes

import Colombia.android.svape.cantantes.databinding.ItemArtistListBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RecyclerAdapter (val artist:List<Artist>):RecyclerView.Adapter<RecyclerAdapter.ArtistHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ArtistHolder(layoutInflater.inflate(R.layout.item_artist_list, parent, false))

    }

    override fun getItemCount(): Int = artist.size



    override fun onBindViewHolder(holder: ArtistHolder, position: Int) {
        holder.render(artist[position])
    }

    class ArtistHolder(val view: View):RecyclerView.ViewHolder(view){
        fun render(artist: Artist){

            val binding = ItemArtistListBinding.bind(view)
            binding.tvRealName.text = artist.realName
            binding.tvArtist.text = artist.artist
            binding.tvGenre.text = artist.genre
            Picasso.get().load(artist.photo).into(binding.ivPeople)
            view.setOnClickListener(){
                Toast.makeText(view.context, "Seleccionaste ${artist.artist}", Toast.LENGTH_SHORT).show()
            }
        }
    }


}