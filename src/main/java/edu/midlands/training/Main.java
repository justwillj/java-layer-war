package edu.midlands.training;

import java.util.*;

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
        //Shuffles the deck of cards before we spilt it in half
        Collections.shuffle(deckOfCards);

        ArrayList<Card>player_1 = new ArrayList<Card>();
        ArrayList<Card>player_2 = new ArrayList<Card>();
        player_1.addAll(deckOfCards.subList(0,26));
        player_2.addAll(deckOfCards.subList(26,deckOfCards.size()));
        System.out.println(player_1.size());
        System.out.println(player_2.size());

        






    }

}