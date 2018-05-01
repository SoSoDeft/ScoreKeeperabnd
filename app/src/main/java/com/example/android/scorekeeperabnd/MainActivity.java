package com.example.android.scorekeeperabnd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // Declare...
    Toolbar toolbar;

    // Text for team score display
    TextView teamOne, teamTwo;

    // Scores
    int teamOneScore, teamTwoScore;

    // Buttons for scores
    Button teamOneTd, teamOneFg, teamOneSfty, teamOneXpt,
            teamTwoTd, teamTwoFg, teamTwoSfty, teamTwoXpt;

    // Reset button
    Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Locate toolbar in activity xml layout
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Make toolbar act like action bar
        setSupportActionBar(toolbar);


        //Initialize...Score
        teamOne = (TextView) findViewById(R.id.team_one_score);
        teamTwo = (TextView) findViewById(R.id.team_two_score);

        //...Buttons
        teamOneTd = (Button) findViewById(R.id.team_one_td);
        teamOneFg = (Button) findViewById(R.id.team_one_fg);
        teamOneSfty = (Button) findViewById(R.id.team_one_sfty);
        teamOneXpt = (Button) findViewById(R.id.team_one_xpt);

        teamTwoTd = (Button) findViewById(R.id.team_two_td);
        teamTwoFg = (Button) findViewById(R.id.team_two_fg);
        teamTwoSfty = (Button) findViewById(R.id.team_two_sfty);
        teamTwoXpt = (Button) findViewById(R.id.team_two_xpt);

        reset = (Button) findViewById(R.id.reset);

        // Set initial scores to zero
        teamOne.setText("0");
        teamTwo.setText("0");

        // Connect onClick listeners...
        teamOneTd.setOnClickListener(this);
        teamOneFg.setOnClickListener(this);
        teamOneSfty.setOnClickListener(this);
        teamOneXpt.setOnClickListener(this);

        teamTwoTd.setOnClickListener(this);
        teamTwoFg.setOnClickListener(this);
        teamTwoSfty.setOnClickListener(this);
        teamTwoXpt.setOnClickListener(this);

        reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) { // Onclick, update score according to score type.

        switch (view.getId()) {

            case R.id.team_one_td:
                teamOneScore += 6;
                teamOne.setText(String.valueOf(teamOneScore));
                break;
            case R.id.team_one_fg:
                teamOneScore += 3;
                teamOne.setText(String.valueOf(teamOneScore));
                break;
            case R.id.team_one_sfty:
                teamOneScore += 2;
                teamOne.setText(String.valueOf(teamOneScore));
                break;
            case R.id.team_one_xpt:
                teamOneScore += 1;
                teamOne.setText(String.valueOf(teamOneScore));
                break;
            case R.id.team_two_td:
                teamTwoScore += 6;
                teamTwo.setText(String.valueOf(teamTwoScore));
                break;
            case R.id.team_two_fg:
                teamTwoScore += 3;
                teamTwo.setText(String.valueOf(teamTwoScore));
                break;
            case R.id.team_two_sfty:
                teamTwoScore += 2;
                teamTwo.setText(String.valueOf(teamTwoScore));
                break;
            case R.id.team_two_xpt:
                teamTwoScore += 1;
                teamTwo.setText(String.valueOf(teamTwoScore));
                break;
            case R.id.reset:
                reset();

        }

    }


    private void reset() {

        teamOneScore = 0;
        teamTwoScore = 0;

        teamOne.setText(String.valueOf(teamOneScore));
        teamTwo.setText(String.valueOf(teamTwoScore));

    }


}
