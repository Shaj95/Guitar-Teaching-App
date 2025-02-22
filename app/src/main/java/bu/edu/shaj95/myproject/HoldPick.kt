package bu.edu.shaj95.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.MediaController
import android.widget.VideoView

class HoldPick : AppCompatActivity() {

    private lateinit var holdPick: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hold_pick)

        holdPick = findViewById<VideoView>(R.id.hold_pick)
        holdPick.setVideoPath("android.resource://" + packageName + "/" + R.raw.holdpick)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(holdPick)
        holdPick.setMediaController(mediaController)
        holdPick.start()


    }
}