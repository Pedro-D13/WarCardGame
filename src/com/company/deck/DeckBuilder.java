package com.company.deck;

import com.company.Cards;
import com.company.Suit;

import java.util.ArrayList;

public class DeckBuilder {


    static public ArrayList<Integer> generateNumbers() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 1; i < 14; i++) {
            listOfNumbers.add(i);
        }
        return listOfNumbers;
    }


    public static ArrayList<Cards> createDeck() {
        ArrayList<Suit> faceCards = Suit.getAllSuits();
        ArrayList<Integer> numbers = generateNumbers();
        ArrayList<Cards> tempDeck = new ArrayList<>();
        for (Suit faceCard : faceCards) {
            for (Integer num : numbers) {
                tempDeck.add(new Cards(faceCard, num));
            }
        }
        return new ArrayList<Cards>(tempDeck);
    }


}
