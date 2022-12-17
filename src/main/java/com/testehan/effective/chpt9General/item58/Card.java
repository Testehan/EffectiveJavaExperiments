package com.testehan.effective.chpt9General.item58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Card {
    private final Suit suit;
    private final Rank rank;

    // Can you spot the bug?
    enum Suit { CLUB, DIAMOND, HEART, SPADE }
    enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING }

    static Collection<Suit> suits = Arrays.asList(Suit.values());
    static Collection<Rank> ranks = Arrays.asList(Rank.values());

    Card(Suit suit, Rank rank ) {
        this.suit = suit;
        this.rank = rank;
    }

    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();

        // Not a good approach as it contains a bug
//        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); )
//            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); )
//                // The problem is that the next method is
//                // called too many times on the iterator for the outer collection (suits). It should be
//                // called from the outer loop so that it is called once per suit, but instead it is called
//                // from the inner loop, so it is called once per card. After you run out of suits, the
//                // loop throws a NoSuchElementException.
//                deck.add(new Card(i.next(), j.next()));

//        // Preferred idiom for nested iteration on collections and arrays
        for (Suit suit : suits)
            for (Rank rank : ranks)
                deck.add(new Card(suit, rank));

    }
}
