package com.company;

import java.util.ArrayList;

public class Player {

    private String Name;
    private int Score;
    private Hand hand;

    public Player(String Name, int Score) {
        this.Name = Name;
        this.Score = Score;
    }

    public ArrayList<Die> rollHand(){
        hand.rollDice();
        return hand.dice;
    }

    public void setHand(Hand hand){
        this.hand = hand;
    }

    public String getName() {
        return Name;
    }

    public void setName(String playerName) {
        this.Name = playerName;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int playerScore) {
        this.Score = playerScore;
    }




}
