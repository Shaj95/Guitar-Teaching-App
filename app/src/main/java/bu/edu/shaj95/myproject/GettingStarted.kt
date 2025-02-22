package bu.edu.shaj95.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class GettingStarted : AppCompatActivity() {

    private lateinit var notesTheme: ImageView
    private lateinit var guitarParts: Button
    private lateinit var stringNames: Button
    private lateinit var pickHold: Button
    private lateinit var pressStrings: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getting_started)

        notesTheme = findViewById(R.id.notesTheme)
        notesTheme.setImageResource(R.drawable.notestheme)

        guitarParts = findViewById(R.id.guitarParts)
        stringNames = findViewById(R.id.stringNames)
        pickHold = findViewById(R.id.pickHold)
        pressStrings = findViewById(R.id.pressStrings)

        Toast.makeText(this, "Once you've completed these guides, head over to the Basic techniques!", Toast.LENGTH_LONG).show()

        guitarParts.setOnClickListener{ view ->
            startActivity(Intent(this, GuitarParts::class.java))
        }

        stringNames.setOnClickListener{ view ->
            startActivity(Intent(this, StringsAndNotes::class.java))
        }

        pickHold.setOnClickListener{ view ->
            startActivity(Intent(this, HoldPick::class.java))
        }

        pressStrings.setOnClickListener{ view ->
            startActivity(Intent(this, PressStrings::class.java))
        }

    }
}