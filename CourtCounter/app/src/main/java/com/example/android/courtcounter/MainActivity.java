package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0,scoreTeamB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * increase the score for Team A by 3 points
     */
    public void addThreepointTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * increase the score for Team A by 2 points
     */
    public void addTwopointTeamA(View v){
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * increase the score for Team A by 1 points
     */
    public void addFreethrowTeamA(View v){
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Display the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * increase the score for Team A by 3 points
     */
    public void addThreepointTeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * increase the score for Team A by 2 points
     */
    public void addTwopointTeamB(View v){
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * increase the score for Team A by 1 points
     */
    public void addFreethrowTeamB(View v){
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Display the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
