package bu.edu.shaj95.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class BasicActivity : AppCompatActivity() {

    private lateinit var notesTheme: ImageView
    private lateinit var strumming: Button
    private lateinit var chordsMajor: Button
    private lateinit var chordsMinor: Button
    private lateinit var basicTasks: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)

        notesTheme = findViewById(R.id.notesTheme)
        notesTheme.setImageResource(R.drawable.notestheme)

        strumming = findViewById(R.id.strumming)
        chordsMajor = findViewById(R.id.chordsMajor)
        chordsMinor = findViewById(R.id.chordsMinor)
        basicTasks = findViewById(R.id.basicTasks)

        Toast.makeText(this, "Once you've completed these guides, head on to the Intermediate techniques!", Toast.LENGTH_LONG).show()

        strumming.setOnClickListener { view ->
            startActivity(Intent(this, Strumming::class.java))
        }

        chordsMajor.setOnClickListener { view ->
            startActivity(Intent(this, MajorChords::class.java))
        }

        chordsMinor.setOnClickListener { view ->
            startActivity(Intent(this, MinorChords::class.java))
        }

        basicTasks.setOnClickListener { view ->
            startActivity(Intent(this, BasicTasks::class.java))

        }
    }
}