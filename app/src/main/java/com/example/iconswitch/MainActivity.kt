package com.example.iconswitch

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //gender buttons
        ImageButton_male.setOnClickListener{
            activateGenderButton(ImageButton_male);
            deactivateGenderButton(ImageButton_female);
        }

        ImageButton_female.setOnClickListener {
            activateGenderButton(ImageButton_female);
            deactivateGenderButton(ImageButton_male);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    fun activateGenderButton(view : View){
        var imageButton: ImageButton = view as ImageButton;
        imageButton.setBackground(ContextCompat.getDrawable(this, R.drawable.gender_button_shape));
        imageButton.setImageTintList(ContextCompat.getColorStateList(this, R.color.white));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    fun deactivateGenderButton(view : View){
        var imageButton: ImageButton = view as ImageButton;
        imageButton.setBackground(ContextCompat.getDrawable(this, R.drawable.gender_button_dark_shape));
        imageButton.setImageTintList(ContextCompat.getColorStateList(this, R.color.battleship_grey));
    }

}
