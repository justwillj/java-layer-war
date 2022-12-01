package edu.midlands.training;

import java.util.ArrayList;

public class War {
    public void war(ArrayList<Card> deck1, ArrayList<Card> deck2, Card card1, Card card2, ArrayList<Card> memorydeck) {


        if (deck1.size() >= 4 && deck2.size() >= 4) {
            Card p1card1 = deck1.remove(0);
            Card p1card2 = deck1.remove(0);
            Card p1card3 = deck1.remove(0);
            Card p1card4 = deck1.remove(0);

            Card p2card1 = deck2.remove(0);
            Card p2card2 = deck2.remove(0);
            Card p2card3 = deck2.remove(0);
            Card p2card4 = deck2.remove(0);


            if (p1card4.getValue() > p2card4.getValue()) //if player1 wins
            {
                deck1.add(card1);
                deck1.add(card2);
                deck1.add(p1card1);
                deck1.add(p1card2);
                deck1.add(p1card3);
                deck1.add(p1card4);
                deck1.add(p2card1);
                deck1.add(p2card2);
                deck1.add(p2card3);
                deck1.add(p2card4);
                //deck1.addAll(memorydeck);
                memorydeck.clear();
                System.out.println("Player 1 wins the war");
                System.out.println(deck1.size());
                //roundCount++;


            } else if (p2card4.getValue() > p1card4.getValue()) {
                deck2.add(card1);
                deck2.add(card2);
                deck2.add(p1card1);
                deck2.add(p1card2);
                deck2.add(p1card3);
                deck2.add(p1card4);
                deck2.add(p2card1);
                deck2.add(p2card2);
                deck2.add(p2card3);
                deck2.add(p2card4);
                //deck2.addAll(memorydeck);
                memorydeck.clear();
                System.out.println(deck2.size());
                System.out.println("Player 2 wins the war");

            } else if (p1card4.getValue() == p2card4.getValue()) {
                System.out.println("They both same");
                ArrayList<Card> memorydeck_new = new ArrayList<Card>();
                deck1.add(card1);
                deck2.add(card2);
                memorydeck_new.add(p1card1);
                memorydeck_new.add(p1card2);
                memorydeck_new.add(p1card3);
                memorydeck_new.add(p1card4);
                memorydeck_new.add(p2card1);
                memorydeck_new.add(p2card2);
                memorydeck_new.add(p2card3);
                memorydeck_new.add(p2card4);

                war(deck1, deck2, p1card4, p2card4, memorydeck_new);



            }

        }
    }
}
