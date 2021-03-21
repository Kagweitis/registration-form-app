package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterBtnClick (View view){
        //defines your textviews
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtSecondName = findViewById(R.id.txtSecodnName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        //defining my edit texts

        EditText edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        EditText edtTxtSecondName = findViewById(R.id.edtTxtSecondName);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);


        //sets our textview called txtFirstName to the result of our edit text 'edtTxtFirstName' which will be converted to string
        txtFirstName.setText("First Name: " + edtTxtFirstName.getText().toString());
        txtSecondName.setText("Second Name: " + edtTxtSecondName.getText().toString());
        txtEmail.setText("Email Address is: " + edtTxtEmail.getText().toString());
    }

}