package edu.midlands.training;
import java.util.ArrayList;

public class Card {
    private String suit;
    private String rank;
    private int value;

    public Card(){

    }
    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;

        if (rank.equals("A")){
            value = 1;
        } else if (rank.equals("2")) {
            value = 2;
        } else if (rank.equals("3")) {
            value = 3;
        }else if (rank.equals("4")) {
            value = 4;
        }else if (rank.equals("5")) {
            value = 5;
        }else if (rank.equals("6")) {
            value = 6;
        }else if (rank.equals("7")) {
            value = 7;
        }else if (rank.equals("8")) {
            value = 8;
        }else if (rank.equals("9")) {
            value = 9;
        }else if (rank.equals("10")) {
            value = 10;
        }else if (rank.equals("J")) {
            value = 11;
        }else if (rank.equals("Q")) {
            value = 12;
        }else if (rank.equals("K")) {
            value = 13;
        }
    }
    //getter method
    public String getSuit(){
        return suit;
    }
    public String getRank(){
        return rank;
    }

    public int getValue(){
        return value;
    }

    public String toString(){
        return rank + " of " + suit;
    }
}
