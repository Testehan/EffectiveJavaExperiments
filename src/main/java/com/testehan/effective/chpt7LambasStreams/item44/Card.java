package com.testehan.effective.chpt7LambasStreams.item44;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
    Which of the two versions of newDeck is better? It boils down to personal preference and the environment in which
    you’re programming. The first version is simpler and perhaps feels more natural. A larger fraction of Java programmers
    will be able to understand and maintain it, but some programmers will feel more comfortable with the second (stream-based)
    version. It’s a bit more concise and not too difficult to understand if you’re reasonably well-versed in streams and
    functional programming. If you’re not sure which version you prefer, the iterative version is probably the safer choice.
    If you prefer the stream version and you believe that other programmers who will work with the code will share your
    preference, then you should use it.
*/

public class Card {
    public enum Suit { SPADE, HEART, DIAMOND, CLUB }
    public enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING }

    private final Suit suit;
    private final Rank rank;

    @Override public String toString() {
        return rank + " of " + suit + "S";
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;

    }
    private static final List<Card> NEW_DECK = newDeck();

    // Iterative Cartesian product computation
//    private static List<Card> newDeck() {
//        List<Card> result = new ArrayList<>();
//        for (Suit suit : Suit.values())
//            for (Rank rank : Rank.values())
//                result.add(new Card(suit, rank));
//        return result;
//    }

   // Stream-based Cartesian product computation
   // And here is a stream-based implementation that makes use of the intermediate
   // operation flatMap. This operation maps each element in a stream to a stream and
   // then concatenates all of these new streams into a single stream (or flattens them).
    private static List<Card> newDeck() {
        return Stream.of(Suit.values())
                .flatMap(suit ->
                        Stream.of(Rank.values())
                                .map(rank -> new Card(suit, rank)))
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println(NEW_DECK);
    }
}