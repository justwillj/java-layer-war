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

        for(int i=0;i<player_1.size();i++){
            for(int j=0;j<player_2.size();j++){

                Card p1 = player_1.remove(i);
                Card p2 = player_2.remove(j);
                System.out.println(p1);
                System.out.println(p2);

                if(p1.getValue() > p2.getValue()){
                    System.out.println("Player1 wins!");
                    player_1.add(p1);
                    player_2.add(p2);
                }
                else{
                    System.out.println("Player2 wins!");
                    player_2.add(p1);
                    player_2.add(p2);
                }
            }
        }






    }

}