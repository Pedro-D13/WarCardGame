package com.CardGame.Deck;

import com.CardGame.PlayingCard.Card;
import com.CardGame.PlayingCard.Suit;

import java.util.ArrayList;

public class DeckBuilder {
    static private ArrayList<Integer> generateNumbers() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 1; i < 14; i++) {
            listOfNumbers.add(i);
        }
        return listOfNumbers;
    }


    public static ArrayList<Card> createDeck() {
        ArrayList<Suit> faceCards = Suit.getAllSuits();
        ArrayList<Integer> numbers = generateNumbers();
        ArrayList<Card> tempDeck = new ArrayList<>();
        for (Suit faceCard : faceCards) {
            numbers.stream().map(num -> {
                try {
                    return new Card(faceCard, num);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }).forEach(tempDeck::add);
        }
        return new ArrayList<>(tempDeck);
    }


}
