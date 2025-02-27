package mx.edu.itson.practica5_247253

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class
ProductosActivity : AppCompatActivity() {
    var menu:ArrayList<Product> = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        var menuOption: String? = intent.getStringExtra("menuType")
        var imageView: ImageView =findViewById(R.id.imageView)

        agregarProductos(imageView,menuOption)
        var listView: ListView =findViewById(R.id.listview) as ListView

        var adaptador:AdaptadorProductos=AdaptadorProductos(this,menu)
        listView.adapter=adaptador


    }


    fun agregarProductos(imageView: ImageView,option:String?){
        when(option){
            "Antojitos" -> {
                menu.add(Product("Quesadillas", R.drawable.quesadillas, "Rellenas con su carne favorita, servidas con ensalada - Filled with your choice of meat, served with salad.", 5.99))
                menu.add(Product("Huaraches", R.drawable.huaraches, "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema - Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream.", 10.99))
                menu.add(Product("Gringas", R.drawable.gringas, "Tortilla de harina con queso, carne al pastor y piña - Flour tortilla filled with cheese, marinated pork and pineapple.", 7.99))
                menu.add(Product("Sincronizadas", R.drawable.sincronizadas, "Tortilla de harina rellena con queso y jamón. Acompañada de lechuga, crema y guacamole - Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.", 7.99))
                menu.add(Product("Gringas", R.drawable.gringas, "Tortilla de harina con queso, carne al pastor y piña - Flour tortilla filled with cheese, marinated pork and pineapple.", 7.99))
                menu.add(Product("Sopes", R.drawable.sopes, "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema - Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, and sour cream.", 3.79))
                menu.add(Product("Tostadas", R.drawable.tostadas, "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate - Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes.", 4.59))

            }
            "Especialidades" ->{
                menu.add(Product("Mojarra Frita", R.drawable.mojarra, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.", 17.99))
                menu.add(Product("Ceviche", R.drawable.ceviche, "Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips", 6.99))
                menu.add(Product("Botana Camarones", R.drawable.botanacamarones, "Botana Camarones", 19.99))
                menu.add(Product("Coctel", R.drawable.coctel, "Shrimp cocktail", 21.99))

            }

            "Combinations" ->{
                menu.add(Product("Traditional Taco Combo", R.drawable.combinationtaco, "Tortilla de Maíz y tu carne favorita. Servido con arroz y frijoles - Corn taco, your choice of meat, served with rice and beans.", 6.99))
                menu.add(Product("Mexican Burritos", R.drawable.cominationburros, "Tu carne favorita en una tortilla grande de harina rellena con cebolla frita, pico de gallo, guacamole, sour cream, frijoles y acompañado de arroz -Your choice of meat on a big burrito made of flour tortilla with rice, beans, lettuce, grilled onions, pico de gallo, guacamole and sour cream.", 12.99))
                menu.add(Product("Los Portales Burritos", R.drawable.burritosportales, "Large flour tortilla filled with grilled cactus, steak, pastor (seasoned pork), grilled onions, rice and beans. Served with a side of lettuce salad, tomatoes, sour cream and guacamole.", 13.59))
                menu.add(Product("Cinco", R.drawable.cinco, "One hard sell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, guacamole and beans. Served with rice and beans.", 9.99))
                menu.add(Product("Dos Amigos", R.drawable.dosamigos, "Two hard shell tacos with your choice of meat topped with lettuce and shredded cheese. served with a side of rice and beans", 9.99))
                menu.add(Product("Burrito Pepe", R.drawable.burritopepe, "Flour tortilla filled with your choice of meat with beans, lettuce, sour cream, guacamole and pico de gallo. served with a side of rice.", 9.99))
                menu.add(Product("Fajita Quesadilla", R.drawable.fajitaquesadilla, "Quesadilla extra grande (10 inches), rellena con tu carne favorita, cebolla asada, chile banana y jitomate. Servida con arroz, frijoles y ensalada - 10 inches quesadilla filled with your choice of meat, cooked with grilled onions, banana peppers and tomatoes. Served with rice beans and salad.", 13.99))

            }

            "Drinks" ->{
                menu.add(Product("Jarritos", R.drawable.jarritos, "Drink Jarritos", 2.99))
                menu.add(Product("Caguama", R.drawable.caguama, "Drinik Caguama Rica", 7.99))
                menu.add(Product("Mexican Beer", R.drawable.mexicanbeer, "Drink Mexican Beer", 4.99))
                menu.add(Product("Domestic Beer", R.drawable.domesticbeer, "Drink Domestic Beer", 5.99))
                menu.add(Product("Caguama Michelada", R.drawable.caguamamichelada, "Drink Caguama Michelada", 13.99))
                menu.add(Product("Michelada", R.drawable.michelada, "Drink Michelada", 10.99))
                menu.add(Product("Cubeta Six", R.drawable.cubetasix, "Cubeta Six Cerveza", 9.99))
                menu.add(Product("Cubetazo", R.drawable.cubetazo, "Cubetazo Cerveza", 14.99))
                menu.add(Product("Sodas", R.drawable.sodas, "Soft Drinks", 2.99))

            }

            "Sopas" ->{
                menu.add(Product("Pozole", R.drawable.pozole, "Weekends only", 5.99))
                menu.add(Product("Menudo", R.drawable.menudo, "Wednesday to Sunday", 5.99))
                menu.add(Product("Caldo De Res", R.drawable.caldores, "Caldo De Res", 5.99))
                menu.add(Product("Caldo Camaron", R.drawable.caldocamaron, "Shrimp soup", 13.99))
                menu.add(Product("Sopa De Mariscos", R.drawable.sopamariscos, "Seafood soup", 19.99))

            }

            "Tortas" ->{
                menu.add(Product("Torta Regular", R.drawable.pozole, "All tortas come with lettuce, onions, tomatoes, avocado, sour cream, jalapeno pepper and your choice of meat.", 12.99))
                menu.add(Product("Torta Milanesa Pollo/Res", R.drawable.tortamilanesa, "Breaded Steak or Chicken", 13.99))
                menu.add(Product("Torta Cubana", R.drawable.tortacubana, "Chorizo, asada, jamon, pastor y queso Mexican sausage, steak, marinated pork, ham, and cheese", 5.99))
                menu.add(Product("Torta Mixta", R.drawable.tortamixta, "Chorizo, asada y pastor./ Mexican sausage, steak and marinated pork", 13.99))
                menu.add(Product("Small Torta Mexicana", R.drawable.smallmexican, "Bolillo bread sandwich with your of meat, shredded lettuce, avocado, tomato, onion and sour cream.", 7.39))
            }

        }
    }


}

private class AdaptadorProductos: BaseAdapter{
    var producto=ArrayList<Product>()
    var contexto: Context?=null

    constructor(contexto: Context,producto:ArrayList<Product>){
        this.producto=producto
        this.contexto=contexto
    }

    override fun getCount(): Int {
        return producto.size
    }

    override fun getItem(position: Int): Any {
        return  producto[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var prod = producto[position]
        var inflator = LayoutInflater.from(contexto)
        var vista = inflator.inflate(R.layout.producto_view,null)

        var imagen = vista.findViewById(R.id.producto_img) as ImageView
        var nombre = vista.findViewById(R.id.producto_nombre) as TextView
        var desc = vista.findViewById(R.id.producto_desc) as TextView
        var precio = vista.findViewById(R.id.producto_precio) as TextView

        imagen.setImageResource(prod.image)
        nombre.setText(prod.name)
        desc.setText(prod.description)
        precio.setText("$${prod.price}")
        return vista
    }
}