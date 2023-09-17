package com.example.myapplication

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity(), SensorEventListener {

    var flag: Boolean = false;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //step 1 create sensor manager object
        val sm = getSystemService(SENSOR_SERVICE) as SensorManager

        // step 3
        //val proximitySensor = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY)
        val accelerometerSensor = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        sm.registerListener(this,accelerometerSensor,SensorManager.SENSOR_DELAY_NORMAL)
    }

    // step 2 implementing event listener
    override fun onSensorChanged(event: SensorEvent?) {
        //val message: TextView= findViewById(R.id.message)
        //message.text = "X: "+event!!.values[0].toString()+"\n"+"Y: "+event!!.values[1].toString()+"\n"+"Z: "+event!!.values[2].toString()+"\n"
        val img: ImageView = findViewById(R.id.imageView)
        //event!!.values[0].toString().toInt()
        if( Integer.parseInt( event!!.values[0].toString())> 7 || Integer.parseInt(event!!.values[0].toString()) < -7  ){
            flag =! true
        } else {
            flag =! false
        }

        if(flag){
            img.setImageResource(R.drawable.bulboff)
        } else {
            img.setImageResource(R.drawable.bulbon)
        }
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }


}