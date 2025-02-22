package bu.edu.shaj95.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var mainTheme: ImageView
    private lateinit var gettingStarted: Button
    private lateinit var basicSteps: Button
    private lateinit var interSteps: Button
    private lateinit var advancedSteps: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainTheme = findViewById(R.id.mainTheme)
        mainTheme.setImageResource(R.drawable.guitartheme)

        gettingStarted = findViewById(R.id.gettingStarted)
        basicSteps = findViewById(R.id.basic)
        interSteps = findViewById(R.id.intermediate)
        advancedSteps = findViewById(R.id.advanced)

        gettingStarted.setOnClickListener{ view ->
            startActivity(Intent(this, GettingStarted::class.java))
        }

        basicSteps.setOnClickListener{ view ->
            startActivity(Intent(this, BasicActivity::class.java))
        }


    }
}