package Christofer.Myaplication

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class Resultado : AppCompatActivity() {
    lateinit var animView: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        animView = findViewById(R.id.animation_view)

        val extras = intent.extras
        val respuestaCorrecta = extras!!.getBoolean("respuesta")
        if (respuestaCorrecta) {
            animView.setAnimation(R.raw.correcto)
        } else {
            animView.setAnimation(R.raw.error)
        }

    }
}
