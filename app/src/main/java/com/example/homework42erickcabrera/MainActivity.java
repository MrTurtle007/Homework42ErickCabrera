package com.example.homework42erickcabrera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    CheckBox cb4;
    CheckBox cb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox) findViewById(R.id.check_box_1);
        cb2 = (CheckBox) findViewById(R.id.check_box_2);
        cb3 = (CheckBox) findViewById(R.id.check_box_3);
        cb4 = (CheckBox) findViewById(R.id.check_box_4);
        cb5 = (CheckBox) findViewById(R.id.check_box_5);
    }

    public void showSelection(View view) {
        String msj = "Toppings:";

        if(cb1.isChecked()) {
            msj = msj + " " + cb1.getText();
        }
        if(cb2.isChecked()) {
            msj = msj + " " + cb2.getText();
        }
        if(cb3.isChecked()) {
            msj = msj + " " + cb3.getText();
        }
        if(cb4.isChecked()) {
            msj = msj + " " + cb4.getText();
        }
        if(cb5.isChecked()) {
            msj = msj + " " + cb5.getText();
        }

        Toast toast = Toast.makeText(this, msj, Toast.LENGTH_LONG);
        toast.show();
    }
}