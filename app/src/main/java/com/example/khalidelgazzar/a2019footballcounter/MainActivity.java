package com.example.khalidelgazzar.a2019footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int scoreTeamA = 0;
    public int scoreTeamB = 0;
    public int yellowCardsTeamA = 0;
    public int yellowCardsTeamB = 0;
    public int redCardsTeamA = 0;
    public int redCardsTeamB = 0;
    public int foulsTeamA= 0;
    public int foulsTeamB = 0;

    /*
        // An alternative way of declaring the variables defined multiple varablies on same line
        // however it does not meet project rubric "Code style" specification
        public int scoreTeamA, scoreTeamB = 0;
        public int yellowCardsTeamA, yellowCardsTeamB = 0;
        public int redCardsTeamA, redCardsTeamB = 0;
        public int foulsTeamA, foulsTeamB = 0;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
    }

    /**
     * Initalize all global varaiables
     */
    public void initVars() {
        scoreTeamA = 0;
        scoreTeamB = 0;
        redCardsTeamA = 0;
        redCardsTeamB = 0;
        yellowCardsTeamA = 0;
        yellowCardsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
    }

    /**
     * Update all text fields for team A, including:
     * - score
     * - Yellow Cards count
     * - Red cards count
     * - Fouls count
     */
    public void displayForTeamA() {
        // update Team A score
        TextView teamAScoreTV = (TextView) findViewById(R.id.team_a_score);
        teamAScoreTV.setText(Integer.toString(scoreTeamA));
        // same as: teamAScoreTV.setText(String.valueOf(teamAScore)));

        // update yellow card display
        TextView yCardsTeamA = (TextView) findViewById(R.id.yellow_cards_team_a);
        yCardsTeamA.setText(Integer.toString(yellowCardsTeamA));

        // update red card display
        TextView rCardsTeamA = (TextView) findViewById(R.id.red_cards_team_a);
        rCardsTeamA.setText(Integer.toString(redCardsTeamA));

        // update fouls display
        TextView fTeamA = (TextView) findViewById(R.id.number_of_fouls_team_a);
        fTeamA.setText(Integer.toString(foulsTeamA));
    }

    /**
     * Goal scored for Team A:
     * - Update the score count
     * - Update display
     *
     * @param view
     */
    public void goalForTeamA(View view) {
        scoreTeamA++;
        displayForTeamA();
    }

    /**
     * Yellow card for Team A:
     * - Update the yellow cards count
     * - update display
     *
     * @param view
     */
    public void yellowCardForTeamA(View view) {
        yellowCardsTeamA++;
        displayForTeamA();
    }

    /**
     * Red card for Team A:
     * - Update the red cards count
     * - update display
     *
     * @param view
     */
    public void redCardForteamA(View view) {
        redCardsTeamA++;
        displayForTeamA();
    }

    /**
     * Foul for Team A:
     * - Update the fouls count
     * - update display
     *
     * @param view
     */
    public void foulForteamA(View view) {
        foulsTeamA++;
        displayForTeamA();
    }

    /**
     * reset all global variable (for both teams)
     * reset all displays
     *
     * @param view
     */
    public void reset(View view) {
        initVars();
        displayForTeamA();
        displayForTeamB();
    }

    /**
     * Update all text fields for team A, including:
     * - score
     * - Yellow Cards count
     * - Red cards count
     * - Fouls count
     */
    public void displayForTeamB() {
        // update Team B score
        TextView teamBScoreTV = (TextView) findViewById(R.id.team_b_score);
        teamBScoreTV.setText(Integer.toString(scoreTeamB));

        // update yellow card display for team B
        TextView yCardsTeamB = (TextView) findViewById(R.id.yellow_cards_team_b);
        yCardsTeamB.setText(Integer.toString(yellowCardsTeamB));

        // update red card display
        TextView rCardsTeamB = (TextView) findViewById(R.id.red_cards_team_b);
        rCardsTeamB.setText(Integer.toString(redCardsTeamB));

        // update fouls display
        TextView fTeamB = (TextView) findViewById(R.id.number_of_fouls_team_b);
        fTeamB.setText(Integer.toString(foulsTeamB));
    }

    /**
     * Goal scored for Team B:
     * - Update the score count
     * - Update display
     *
     * @param view
     */
    public void goalForTeamB(View view) {
        scoreTeamB++;
        displayForTeamB();
    }

    /**
     * Yellow card for Team B:
     * - Update the yellow cards count
     * - update display
     *
     * @param view
     */
    public void yellowCardForTeamB(View view) {
        yellowCardsTeamB++;
        displayForTeamB();
    }

    /**
     * Red card for Team B:
     * - Update the red cards count
     * - update display
     *
     * @param view
     */
    public void redCardForteamB(View view) {
        redCardsTeamB++;
        displayForTeamB();
    }

    /**
     * Foul for Team B:
     * - Update the fouls count
     * - update display
     *
     * @param view
     */
    public void foulForteamB(View view) {
        foulsTeamB++;
        displayForTeamB();
    }
}