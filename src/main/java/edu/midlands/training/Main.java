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
        int count = 0;

        Card war1 = new Card();


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
                    System.out.println(deckOne.size());
                    System.out.println(deckTwo.size());

                    if(deckOne.size() < 4){
                        System.out.println("Player 2 wins the game!");
                        break;
                    } else if(deckTwo.size() <4){
                        System.out.println("Player 1 wins the game!");
                        break;
                    } else if(deckOne.get(3).getValue()>deckTwo.get(3).getValue()){
                        //Players 1 wins
                        Card lossPlayer21 = deckTwo.remove(0);
                        Card lossPlayer22 = deckTwo.remove(1);
                        Card lossPlayer23 = deckTwo.remove(2);
                        Card lossPlayer24 = deckTwo.remove(3);

                        deckOne.add(lossPlayer21);
                        deckOne.add(lossPlayer22);
                        deckOne.add(lossPlayer23);
                        deckOne.add(lossPlayer24);

                        System.out.println("Player 1 wins the war!");

                    } else if (deckOne.get(3).getValue()<deckTwo.get(3).getValue()) {

                        Card lossPlayer21 = deckOne.remove(0);
                        Card lossPlayer22 = deckOne.remove(1);
                        Card lossPlayer23 = deckOne.remove(2);
                        Card lossPlayer24 = deckOne.remove(3);

                        deckTwo.add(lossPlayer21);
                        deckTwo.add(lossPlayer22);
                        deckTwo.add(lossPlayer23);
                        deckTwo.add(lossPlayer24);


                        System.out.println("Player 2 wins the war!");

                    } else if (deckOne.get(3).getValue()==deckTwo.get(3).getValue()){
                        System.out.println("Test");
                    }


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