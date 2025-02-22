package bu.edu.shaj95.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView

class MinorChords : AppCompatActivity() {

    private lateinit var fingerPlace: ImageView
    private lateinit var minorChords: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minor_chords)

        fingerPlace = findViewById(R.id.finger_place)
        fingerPlace.setImageResource(R.drawable.fingerplace)

        minorChords = findViewById(R.id.minor_chords)
        minorChords.setImageResource(R.drawable.minorchords)
        
    }
}