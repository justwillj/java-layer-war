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

        ArrayList<Card>deckOne = new ArrayList<Card>();
        ArrayList<Card>deckTwo = new ArrayList<Card>();
        deckOne.addAll(deckOfCards.subList(0,26));
        deckTwo.addAll(deckOfCards.subList(26,deckOfCards.size()));
        System.out.println(deckOne.size());
        System.out.println(deckTwo.size());


            while (true) {
                Card p1 = deckOne.remove(0);
                Card p2 = deckTwo.remove(0);

                System.out.println("Player 1: " + p1);
                System.out.println("Player 2: " + p2);

                if (p1.getValue() > p2.getValue()) {
                    deckOne.add(p1);
                    deckOne.add(p2);
                    System.out.println("Player1 wins!");
                    System.out.println(deckTwo.size());
                    System.out.println(deckOne.size());
                }
                else if (p1.getValue() < p2.getValue()){
                    deckTwo.add(p1);
                    deckTwo.add(p2);
                    System.out.println("Player2 wins!");
                    System.out.println(deckTwo.size());
                    System.out.println(deckOne.size());
                } else if (p1.getValue() == p1.getValue()) {
                    deckTwo.add(p1);
                    deckTwo.add(p2);
                    System.out.println("Player 2 wins the WAR");
                    break;
                }
                //else {
//                    System.out.println("War");
//
//                    List<Card> warDeck1 = new ArrayList<Card>();
//                    List<Card> warDeck2 = new ArrayList<Card>();
//
//                    for(int j=0; j<3; j++) {
//                        if (deckOne.size() == 0 || deckTwo.size() == 0) {
//                            break;
//                        }//end if
//
//                        System.out.println(
//                            "War card for player1 is xx\nWar card for player2 is xx");
//
//                        warDeck1.add(deckOne.remove(0));
//                        warDeck2.add(deckTwo.remove(0));
//                    }
//                        if (warDeck1.size() == 3 && warDeck2.size() == 3) {
//                            System.out.println("War card for player1 is " + warDeck1.get(0));
//                            System.out.println("War card for player1 is " + warDeck1.get(0));
//
//                            if (warDeck1.get(2).getValue() > warDeck2.get(2).getValue()) {
//                                deckOne.addAll(warDeck1);
//                                deckTwo.addAll(warDeck2);
//                                System.out.println("Player1 wins the war round");
//                            } else {
//                                deckOne.addAll(warDeck1);
//                                deckTwo.addAll(warDeck2);
//                                System.out.println("Player2 wins the war round");
//                            }//end else
//                        }//end if
//                    }//end war round else

                if(deckOne.size() == 0){
                    System.out.println("Player2 Wins the game");
                    break;
                }
                else if (deckOne.size() == 0){
                    System.out.println("Player2 Wins the game");
                    break;
                }
                System.out.println(deckOne.size());
                System.out.println(deckTwo.size());
            }//end while

    }

}