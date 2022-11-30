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
                } else { //war happens when both cards' rank matched
                    System.out.println("War");

                    //creating war cards
                    List<Card> warDeckOne = new ArrayList<Card>();
                    List<Card> warDeckTwo = new ArrayList<Card>();

                    //checking do players have enough (4)cards to stay in game
                    for(int x=0; x<3; x++){
                        //either one player runs out of card is game over
                        if(deckOne.size() == 0){//change if to say who ran out of card
                            System.out.println("Player 1 out of cards. Player 2 Wins");
                            break;
                        }else if (deckTwo.size() == 0 ){
                            System.out.println("Player 2 out of cards. Player 1 Wins");
                            break;
                        }//end if

                        System.out.println("War card for player 1 is x\nWar card for player 2 is x");

                        warDeckOne.add(deckOne.remove(0));  //place additional card for war
                        warDeckTwo.add(deckTwo.remove(0));
                    }//end for

                    //only compare result when both players have enough cards for war
                    if(warDeckOne.size() == 3 && warDeckTwo.size() == 3 ){
                        //display the war cards from each player
                        System.out.println("War card for player1 is " + warDeckOne.get(0).toString());
                        System.out.println("War card for player2 is " + warDeckTwo.get(0).toString());

                        //if player 1 wins the war round
                        if(warDeckOne.get(2).getValue() > warDeckTwo.get(2).getValue()){
                            deckOne.addAll(warDeckOne); //player1 get all 10 cards
                            deckOne.addAll(warDeckTwo);
                            System.out.println("Player One Wins The War Round");
//                            System.out.println("Player one deck " + deck1.size());
//                            System.out.println("Player two deck " + deck2.size());
                        }//end if
                        //otherwise player 2 wins the war round
                        else{
                            deckTwo.addAll(warDeckOne); //player2 get all 10 cards
                            deckTwo.addAll(warDeckTwo);
                            System.out.println("Player Two Wins The War Round");
//                            System.out.println("Player one deck " + deck1.size());
//                            System.out.println("Player two deck " + deck2.size());
                        }//end else
                    }//end if

                }//end war round else

               if(deckOne.size() == 0){
                    System.out.println("Player 2 Wins the game");
                    break;
                }
                else if (deckTwo.size() == 0){
                    System.out.println("Player 1 Wins the game");
                    break;
                }

            }//end while
        System.out.println(deckOne.size());
        System.out.println(deckTwo.size());
    }

}