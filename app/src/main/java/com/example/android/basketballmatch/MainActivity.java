package com.example.android.basketballmatch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.basketballmatch.R;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    int quantity1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void point3(View view) {
        quantity+=3;
        displayForTeamA(quantity);

    }
    public void point2(View view) {
        quantity+=2;
        displayForTeamA(quantity);

    }
    public void point(View view) {
        quantity+=1;
        displayForTeamA(quantity);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.tv2);
        scoreView.setText(String.valueOf(score));
    }
    public void point6(View view) {
        quantity1+=3;
        displayForTeamB(quantity1);

    }
    public void point5(View view) {
        quantity1+=2;
        displayForTeamB(quantity1);

    }
    public void point4(View view) {
        quantity1+=1;
        displayForTeamB(quantity1);

    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.tv3);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View view) {
        quantity=0;
        quantity1=0;
        displayForTeamA(0);
        displayForTeamB(0);
        TextView scoreView = (TextView) findViewById(R.id.display);
        scoreView.setText("");



    }
    public void finish(View view) {
        display();
    }
    public void display() {
        TextView scoreView = (TextView) findViewById(R.id.display);
        if (quantity>quantity1) {
            String a = "A";
            scoreView.setText("Team: " + a + " wins");
        }
        else if (quantity<quantity1) {
            String a = "B";
            scoreView.setText("Team: " + a + " wins");

        }
        else if (quantity == quantity1) {
            scoreView.setText("Its a draw, GOOD MATCH");
        }

    }

}