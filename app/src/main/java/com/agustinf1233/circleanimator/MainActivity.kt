package com.agustinf1233.circleanimator

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.hitomi.cmlibrary.CircleMenu
import com.hitomi.cmlibrary.OnMenuSelectedListener
import com.hitomi.cmlibrary.OnMenuStatusChangeListener


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circleMenu = findViewById<CircleMenu>(R.id.circle_menu)

        circleMenu.setMainMenu(
            Color.parseColor("#CDCDCD"),
            R.mipmap.ic_menu,
            R.mipmap.ic_menu_round
        )
            .addSubMenu(Color.parseColor("#258CFF"), R.mipmap.ic_launcher)
            .addSubMenu(Color.parseColor("#30A400"), R.mipmap.ic_launcher)
            .addSubMenu(Color.parseColor("#FF4B32"), R.mipmap.ic_launcher)
            .addSubMenu(Color.parseColor("#8A39FF"), R.mipmap.ic_launcher)
            .addSubMenu(Color.parseColor("#FF6A00"), R.mipmap.ic_launcher)
            .setOnMenuSelectedListener(OnMenuSelectedListener { })
            .setOnMenuStatusChangeListener(object : OnMenuStatusChangeListener {
                override fun onMenuOpened() {}
                override fun onMenuClosed() {}
            })
    }
}