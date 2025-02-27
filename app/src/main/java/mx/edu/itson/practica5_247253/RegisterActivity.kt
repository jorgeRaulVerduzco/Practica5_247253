package mx.edu.itson.practica5_247253

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        val button: Button = findViewById(R.id.btn_sign_in)

        button.setOnClickListener {
            val intent = Intent(this, menu_activity::class.java)
            startActivity(intent)
        }

    }
}