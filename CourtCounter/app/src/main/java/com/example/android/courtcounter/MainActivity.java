package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA,scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    public void threePointsForTeamA(View view)
    {   scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void twoPointsForTeamA(View view)
    {   scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void onePointForTeamA(View view)
    {   scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
    public void threePointsForTeamB(View view)
    {   scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void twoPointsForTeamB(View view)
    {   scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void onePointForTeamB(View view)
    {   scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    public void resetScore(View view)
    {
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }



}
