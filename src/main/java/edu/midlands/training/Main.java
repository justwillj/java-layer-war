package edu.midlands.training;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Link to a resources that we found helpful
        //https://books.trinket.io/thinkjava/chapter12.html
        ArrayList<Card> deckOfCards = new ArrayList<>();
        String[] Suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (int i = 0; i < Suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deckOfCards.add( new Card(Suits[i],ranks[j]));
            }
        }
        //Shuffles the deck of cards before we spilt it in half
        Collections.shuffle(deckOfCards);

        ArrayList<Card>deckOne = new ArrayList<Card>();
        ArrayList<Card>deckTwo = new ArrayList<Card>();
        deckOne.addAll(deckOfCards.subList(0, 26));
        deckTwo.addAll(deckOfCards.subList(26, deckOfCards.size()));
        System.out.println(deckOne.size());
        System.out.println(deckTwo.size());


            while (true) {
                Card p1 = deckOne.remove(0);
                Card p2 = deckTwo.remove(0);

                System.out.println("Player 1: " + p1);
                System.out.println("Player 2: " + p2);

                if (p1.getValue() > p2.getValue()) {
                    deckOne.add(p2);
                    deckOne.add(p1);
                    System.out.println("Player1 wins!");
                    System.out.println("player 1 deck size " + deckOne.size());
                    System.out.println("player 2 deck size " + deckTwo.size());
                }
                else if (p1.getValue() < p2.getValue()){
                    deckTwo.add(p1);
                    deckTwo.add(p2);
                    System.out.println("Player2 wins!");
                    System.out.println("player 1 deck size " + deckOne.size());
                    System.out.println("player 2 deck size " + deckTwo.size());
                } else if (p1.getValue() == p2.getValue()) {
                    deckTwo.add(p2);
                    deckTwo.add(p1);
                    System.out.println("Player 2 wins the WAR");
                    System.out.println("player 1 deck size " + deckOne.size());
                    System.out.println("player 2 deck size " + deckTwo.size());

                    }

               if(deckOne.size() == 0){
                    System.out.println("Player2 Wins the game");
                    break;
                }
                else if (deckTwo.size() == 0){
                    System.out.println("Player1 Wins the game");
                    break;
                }

            }//end while
        System.out.println(deckOne.size());
        System.out.println(deckTwo.size());
    }

}