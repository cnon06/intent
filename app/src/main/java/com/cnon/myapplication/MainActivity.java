package com.cnon.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        intent.getStringExtra("text");
        TextView text2 = findViewById(R.id.text1);
        String getText = intent.getStringExtra("text");
        text2.setText(getText);

    }

    public void secondActivity(View view)
    {

        EditText text = findViewById(R.id.editText);

        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
       // intent.putExtra("text","text.getText()");
        intent.putExtra("text",text.getText().toString());
       startActivity(intent);
   // Log.e("Output",text.getText().toString());
    }

}