package turis.Tic

import android.app.Activity
import android.content.Intent
import android.view.*
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlin.coroutines.coroutineContext

class Adapter (private val context: Activity, private val arrayList: ArrayList<User>): ArrayAdapter<User>(context,
    R.layout.list_item, arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item, null)

        val imageView : ImageView = view.findViewById(R.id.spot_picture)
        val lugarName : TextView =view.findViewById(R.id.spot_name)
        val address : TextView = view.findViewById(R.id.spot_address)


        imageView.setImageResource(arrayList[position].imageId)
        lugarName.text = arrayList[position].name
        address.text = arrayList[position].address




        return view
    }
}
























