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

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            // valid values are ["A","2","3","4","5","6","7","8","9","10","J","Q","K"]
            ArrayList<String> values = new ArrayList<String>();
            values.add("A");
            values.add("2");
            values.add("3");
            values.add("4");
            values.add("5");
            values.add("6");
            values.add("7");
            values.add("8");
            values.add("9");
            values.add("10");
            values.add("J");
            values.add("Q");
            values.add("K");


            if (values.contains(value)) {
                this.value = value;
            }
            else {
                System.out.println("not found");
            }

        }

        public String toString(){
            return String.format("%s of %s",value,suit); // a method to print the value of suit in main class

        }

    }
}
