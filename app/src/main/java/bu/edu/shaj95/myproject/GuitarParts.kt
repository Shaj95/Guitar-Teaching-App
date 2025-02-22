package bu.edu.shaj95.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView

class GuitarParts : AppCompatActivity() {

    private lateinit var guitarPartsImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guitar_parts)

        guitarPartsImage = findViewById(R.id.guitarParts)
        guitarPartsImage.setImageResource(R.drawable.guitarparts)

    }
}