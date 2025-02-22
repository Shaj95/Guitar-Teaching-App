package bu.edu.shaj95.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class Strumming : AppCompatActivity() {

    private lateinit var strumming: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strumming)

        strumming = findViewById<VideoView>(R.id.strumming_1)
        strumming.setVideoPath("android.resource://" + packageName + "/" + R.raw.stringnames1)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(strumming)
        strumming.setMediaController(mediaController)
        strumming.start()

    }
}