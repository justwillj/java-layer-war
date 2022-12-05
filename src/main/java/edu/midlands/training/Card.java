package edu.midlands.training;
import java.util.*;

public class Card {
    /*CODE REVIEW:
       a card has 2 properties, a suit and a value. We can alter the way we display a Card by changing the generated toString() method.
     */
    private String suit;
    private String rank;
    private int value;

    public Card(){

    }
    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    /*CODE REVIEW: you don't want to have if/else statements in a constructor of an object. Instead we want to find a way to make this
    code work for us elsewhere.
     */
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

    public int getValue(){
        return value;
    }

    public String toString(){
        return rank + " of " + suit;
    }

    /*CODE REVIEW: this is how I would change the toString() method to work for a Card class with the 2 properties of suit and value

    @Override
    public String toString() {
        String card = "";
        switch (value){
            case 1:
                card = "A";
                break;
            case 11:
                card = "J";
                break;
            case 12:
                card = "Q";
                break;
            case 13:
                card = "K";
                break;
            default:
                card = String.valueOf(value);
        }
        return card + " of " + suit;
    }

    */
}
