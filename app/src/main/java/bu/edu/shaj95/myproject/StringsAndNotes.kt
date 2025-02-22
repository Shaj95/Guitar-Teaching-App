package bu.edu.shaj95.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class StringsAndNotes : AppCompatActivity() {

    private lateinit var stringNames1: VideoView
    private lateinit var stringNames2: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strings_and_notes)

        stringNames1 = findViewById<VideoView>(R.id.string_names)
        stringNames1.setVideoPath("android.resource://" + packageName + "/" + R.raw.stringnames1)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(stringNames1)
        stringNames1.setMediaController(mediaController)
        stringNames1.start()

        stringNames2 = findViewById<VideoView>(R.id.string_names2)
        stringNames2.setVideoPath("android.resource://" + packageName + "/" + R.raw.stringnames2)
        val mediaController2 = MediaController(this)
        mediaController2.setAnchorView(stringNames2)
        stringNames2.setMediaController(mediaController2)

    }
}