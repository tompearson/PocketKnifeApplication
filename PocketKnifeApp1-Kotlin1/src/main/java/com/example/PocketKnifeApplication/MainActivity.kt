package com.example.PocketKnifeApplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.pocketknifemodule1.*

class MainActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textMessage = findViewById(R.id.message)
        textMessage.setTextColor(Color.BLACK)
        textMessage.setText("")//clear screen

        methodWithPermissions(this)

        textMessage.setText(getNetworkStatus(this))
        textMessage.setText(getLocationStatus(this))
        textMessage.setText(getBlueToothStatus(this))
        textMessage.setText(getMACAddress(this))


    }
}
