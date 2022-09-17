package com.operator.a10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edittext;
    private Button mybutton;
    private Button perehod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mybutton = findViewById(R.id.button);
        edittext = findViewById(R.id.edittext);
        perehod = findViewById(R.id.button2);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Toast.makeText(MainActivity.this,R.string.noouser, Toast.LENGTH_LONG).show();
            }
        });

    }

    public void perehod(View view){
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }
}
