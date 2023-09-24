package com.knackpark.multiplicationtablejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView display = findViewById(R.id.display);
        EditText input = findViewById(R.id.inputField);
        Button btn = findViewById(R.id.button);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                if(TextUtils.isEmpty(input.getText().toString())){

                }else{

                    StringBuffer buffer = new StringBuffer();
                    int inputNumber = Integer.parseInt(input.getText().toString());
                    for(int i=1;i<=10;i++){
                        int ans = i*inputNumber;
                        buffer.append(inputNumber + "X" + i + "=" + ans + "\n\n");
                    }
                    display.setText(buffer);
                }









            }
        });




    }
}