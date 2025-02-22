package bu.edu.shaj95.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MajorChords : AppCompatActivity() {

    private lateinit var fingerPlace: ImageView
    private lateinit var majorChords: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_major_chords)

        fingerPlace = findViewById(R.id.finger_place)
        fingerPlace.setImageResource(R.drawable.fingerplace)

        majorChords = findViewById(R.id.major_chords)
        majorChords.setImageResource(R.drawable.majorchords)

    }
}