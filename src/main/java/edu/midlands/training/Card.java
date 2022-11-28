package edu.midlands.training;
import java.util.ArrayList;

public class Card {

        public String suit,value; // Creating a card class which takes a suit and a value of the card

        public Card(String suit, String value) { // Generating constructors for this object
            setSuit(suit);
            setValue(value);
        }

    public String getSuit() {
        return suit;

        public void setSuit(String suit) {
            // valid suits are ["Hearts", "Spades", "Clubs" , "Diamonds"]
            ArrayList<String> suits = new ArrayList<String>();
            suits.add("Hearts");
            suits.add("Spades");
            suits.add("Clubs");
            suits.add("Diamonds");
            if (suits.contains(suit)) {
                this.suit = suit;
            }
            else{
                System.out.println("not a valid suit");
            }
        }

    }
