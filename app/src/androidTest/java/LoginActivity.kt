import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonLogin: Button = findViewById(R.id.buttonLogin)
        buttonLogin.setOnClickListener {
            val email: String = findViewById<EditText>(R.id.editTextEmail).text.toString()
            val password: String = findViewById<EditText>(R.id.editTextPassword).text.toString()

            // Lakukan validasi login sesuai dengan kebutuhan aplikasi
            // Contoh validasi sederhana: email tidak boleh kosong
            if (email.isNotEmpty()) {
                // Jika login berhasil, tampilkan profil dengan data yang diperoleh
                val intent = Intent(this, ProfileActivity::class.java)
                intent.putExtra("email", email)
                startActivity(intent)
            }
        }
    }
}
