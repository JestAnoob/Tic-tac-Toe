package com.second.tictactoe;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
String b1, b2, b3, b4, b5, b6, b7, b8, b9;
int flag =0;
int count = 0;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inti();

    }

    private void inti() {
        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        bt3 = findViewById(R.id.btn3);
        bt4 = findViewById(R.id.btn4);
        bt5 = findViewById(R.id.btn5);
        bt6 = findViewById(R.id.btn6);
        bt7 = findViewById(R.id.btn7);
        bt8 = findViewById(R.id.btn8);
        bt9 = findViewById(R.id.btn9);
    }
    @SuppressLint("ShowToast")
    public void check(View v) {
        Button btnNow = (Button) v;
        count++;

        if (btnNow.getText().toString().equals("")) {

            if (flag == 0) {
                btnNow.setText("X");
                flag = 1;
            } else {
                btnNow.setText("O");
                flag = 0;
            }

            if (count > 4) {
                b1 = bt1.getText().toString();
                b2 = bt2.getText().toString();
                b3 = bt3.getText().toString();
                b4 = bt4.getText().toString();
                b5 = bt5.getText().toString();
                b6 = bt6.getText().toString();
                b7 = bt7.getText().toString();
                b8 = bt8.getText().toString();
                b9 = bt9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    // 1
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                   newgame();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    // 2
                    Toast.makeText(this, "Winner is " + b4, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    // 3
                    Toast.makeText(this, "Winner is " + b7, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    // 4
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    // 5
                    Toast.makeText(this, "Winner is " + b5, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    // 6
                    Toast.makeText(this, "Winner is " + b6, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    // 7
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    // 8
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    newgame();
                }

            }
        }
        if (count > 8){
            newgame();
        }
    }

    private void newgame() {
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        count = 0;
        flag =0;
    }
}