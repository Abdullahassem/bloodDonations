package com.abdullah.android.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private  EditText joinEmailEditText, otpNumber;
    private EditText bloodTypeEditText, joinPhoneEditText,joinPasswordEditText,joinNameEditText;
    private Button joinButton, signInButton, otpButton;
    private LinearLayout joinLayout,signInLayout;
    private Context context=this;
    TextInputLayout phoneNumber;
//    CountryCodePicker countryCodePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinEmailEditText = findViewById(R.id.join_email);
        bloodTypeEditText = findViewById(R.id.blood_type);
        joinPhoneEditText= findViewById(R.id.join_phone);
        joinPasswordEditText= findViewById(R.id.join_password);
        joinNameEditText = findViewById(R.id.join_name);
        joinButton=findViewById(R.id.join_Button);
        joinLayout=findViewById(R.id.join_layout);
        signInButton=findViewById(R.id.sign_in_button);
        otpButton=findViewById(R.id.otp_button);
        otpNumber=findViewById(R.id.otp_number);




        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animationIn= AnimationUtils.loadAnimation(context, R.anim.slide_in);
                Animation animationOut= AnimationUtils.loadAnimation(context, R.anim.slide_out);

                joinButton.setVisibility(View.GONE);
                signInButton.setVisibility(View.GONE);
                joinLayout.setVisibility(View.VISIBLE);
                joinLayout.startAnimation(animationIn);



//                signInLayout.startAnimation(animationOut);
//                signInLayout.setVisibility(View.GONE);

            }
        });





        }

    public void callVerifyOTPScreen(View view){

        Animation animationIn= AnimationUtils.loadAnimation(context, R.anim.slide_in);
        Animation animationOut= AnimationUtils.loadAnimation(context, R.anim.slide_out);
        joinLayout.setAnimation(animationOut);
        joinLayout.setVisibility(View.GONE);
        otpNumber.setAnimation(animationIn);
        otpNumber.setVisibility(View.VISIBLE);

    }

}
