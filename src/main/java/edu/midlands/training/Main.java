package edu.midlands.training;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Link to a resources that we found helpful
        //https://books.trinket.io/thinkjava/chapter12.html
        ArrayList<Card> deckOfCards = new ArrayList<>();
        String[] suitNew = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (int i = 0; i < suitNew.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deckOfCards.add( new Card(suitNew[i],ranks[j]));
            }
        }
        System.out.println(deckOfCards.size());

    }

}