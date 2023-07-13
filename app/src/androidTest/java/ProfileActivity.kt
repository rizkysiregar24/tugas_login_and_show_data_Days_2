import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val email: String = intent.getStringExtra("email") ?: ""
        val name: String = "John Doe" // Ganti dengan nama sesuai data pengguna
        val major: String = "Computer Science" // Ganti dengan jurusan sesuai data pengguna

        val textViewName: TextView = findViewById(R.id.textViewName)
        textViewName.text = name

        val textViewEmail: TextView = findViewById(R.id.textViewEmail)
        textViewEmail.text = email

        val textViewMajor: TextView = findViewById(R.id.textViewMajor)
        textViewMajor.text = major
    }
}
