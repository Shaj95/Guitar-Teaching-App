package bu.edu.shaj95.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class PressStrings : AppCompatActivity() {

    private lateinit var pressStrings: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_press_strings)

        pressStrings = findViewById<VideoView>(R.id.press_strings)
        pressStrings.setVideoPath("android.resource://" + packageName + "/" + R.raw.pressstrings1)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(pressStrings)
        pressStrings.setMediaController(mediaController)
        pressStrings.start()

    }
}