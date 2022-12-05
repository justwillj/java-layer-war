package edu.midlands.training;

import java.util.*;

public class Main {
    public static void main(String[] args) {

            ArrayList<Card> deckOfCards = new ArrayList<>();

            /*CODE REVIEW: these properties belong to a Deck of Cards, so this should be in its own class. We don't usually have properties
            just around in the Main/Game class, since that is where the logic for the gameplay should be.
             */
            String[] Suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
            String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

            //CODE REVIEW: should be in a Deck class
            for (int i = 0; i < Suits.length; i++) {
                for (int j = 0; j < ranks.length; j++) {
                    deckOfCards.add(new Card(Suits[i], ranks[j]));
                }
            }
            //Shuffles the deck of cards before we spilt it in half
            //CODE REVIEW: should be in a Deck class
            Collections.shuffle(deckOfCards);

            //ArrayList that will hold player decks
            ArrayList<Card> deckOne = new ArrayList<Card>();
            ArrayList<Card> deckTwo = new ArrayList<Card>();

            //Splitting deck of cards into two player decks
            deckOne.addAll(deckOfCards.subList(0, 26));
            deckTwo.addAll(deckOfCards.subList(26, deckOfCards.size()));
            
            ArrayList<Card> warDeck = new ArrayList<Card>();

            //Setting initial value of round counter
            int roundCount = 0;

            //Creating war1 method from War class
            //CODE REVIEW: a War object is not necessary. We just want a method we can call in the case
            // War happens in a round of the game.
            War war1 = new War();


            while (deckOne.size() > 0 && deckTwo.size() > 0) {
              System.out.println("p1 "+ deckOne.size());
              System.out.println("p2 "+ deckTwo.size());
              /*CODE REVIEW: you have to be careful when you start 'removing' cards. At the end of your game you do not have
              all 52 cards in the deck accounted for, so you are losing cards somewhere in your gameplay.
               */
                Card p1 = deckOne.remove(0);
                Card p2 = deckTwo.remove(0);
                System.out.println("Round " + roundCount + " of The War");

                System.out.println("Player 1: " + p1);
                System.out.println("Player 2: " + p2);
                if (p1.getValue() > p2.getValue()) {
                    deckOne.add(p2);
                    deckOne.add(p1);
                    System.out.println("Player 1 wins the war!");
                    roundCount++;

                }
                else if (p1.getValue() < p2.getValue()) {
                    deckTwo.add(p1);
                    deckTwo.add(p2);
                    System.out.println("Player 2 wins the war!");
                    roundCount++;

                }
                //Calls the war method
                else if (p1.getValue() == p2.getValue()) {
                    if (deckOne.size() >= 4 && deckTwo.size() >= 4) {
                        roundCount++;
                        war1.war(deckOne, deckTwo, p1, p2, warDeck);
                    } else {
                        if (deckOne.size() < 4) {
                            System.out.println("Player 2 Wins the game");
                            break;
                        } else if (deckTwo.size() < 4) {
                            System.out.println("Player 1 wins the game");
                            break;
                        }
                    }
                }

                if (deckOne.size() == 0) {
                    System.out.println("Player 2 Wins the game");
                    break;
                } else if (deckTwo.size() == 0) {
                    System.out.println("Player 1 Wins the game");
                    break;
                }
            }
        }
    }
