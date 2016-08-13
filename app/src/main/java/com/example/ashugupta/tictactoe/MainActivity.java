package com.example.ashugupta.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    boolean isPlayerXTurn =false;
    private static int counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);

        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
    }

    public void endGameCheck() {
        String a, b, c, d, e, f, g, h, i;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();

        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();

        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if(a.equals(b.equals(c)) && !a.isEmpty()){
            Toast.makeText(MainActivity.this, "Winner player "+a, Toast.LENGTH_SHORT).show();
            gameOver();
        } else if(d.equals(e.equals(f)) && !d.isEmpty()){
            Toast.makeText(MainActivity.this, "Winner player "+d, Toast.LENGTH_SHORT).show();
            gameOver();
        } else if(g.equals(h.equals(i)) && !g.isEmpty()){
            Toast.makeText(MainActivity.this, "Winner player "+g, Toast.LENGTH_SHORT).show();
            gameOver();
        } else if(a.equals(d.equals(g)) && !a.isEmpty()){
            Toast.makeText(MainActivity.this, "Winner player "+a, Toast.LENGTH_SHORT).show();
            gameOver();
        } else if(b.equals(e.equals(h)) && !b.isEmpty()){
            Toast.makeText(MainActivity.this, "Winner player "+b, Toast.LENGTH_SHORT).show();
            gameOver();
        } else if(c.equals(f.equals(i)) && ! c.isEmpty()){
            Toast.makeText(MainActivity.this, "Winner player "+c, Toast.LENGTH_SHORT).show();
            gameOver();
        } else if(a.equals(e.equals(i)) && !a.isEmpty()){
            Toast.makeText(MainActivity.this, "Winner player "+a, Toast.LENGTH_SHORT).show();
            gameOver();
        } else if(c.equals(e.equals(g)) && !c.isEmpty()){
            Toast.makeText(MainActivity.this, "Winner player "+c, Toast.LENGTH_SHORT).show();
            gameOver();
        }
    }

    private void gameOver() {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }

    @Override
    public void onClick(View view) {
        counter++;
        Button button = (Button) view;
        if (button.getText().toString().equals("")) {
            if (isPlayerXTurn) {
                isPlayerXTurn = false;
                button.setText("X");
            } else if (!isPlayerXTurn) {
                isPlayerXTurn = true;
                button.setText("0");
            }
        }
        if(counter == 9){
            Toast.makeText(MainActivity.this, "Draw match", Toast.LENGTH_SHORT).show();
            gameOver();
        } else if(counter >= 6){
            endGameCheck();
        }
    }
}
