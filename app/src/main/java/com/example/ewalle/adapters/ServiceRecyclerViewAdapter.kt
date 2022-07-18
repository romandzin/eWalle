import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ewalle.R

class ServiceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val service_icon = itemView.findViewById<ImageView>(R.id.service_icon)
    val service_name = itemView.findViewById<TextView>(R.id.service_name)
}

data class Service(var service_icon: Drawable, var service_name: String)

class ServiceRecyclerAdapter(private val serviceList: List<Service>): RecyclerView.Adapter<ServiceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.services_recyclerview_item, parent, false)

        return ServiceViewHolder(view)
    }

    override fun onBindViewHolder(holder: ServiceViewHolder, position: Int) {
        val peopleListItem = serviceList[position]

        holder.service_icon.setImageDrawable(peopleListItem.service_icon)
        holder.service_name.text = peopleListItem.service_name
    }

    override fun getItemCount(): Int {
        return serviceList.size
    }
}