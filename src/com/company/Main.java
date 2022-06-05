package com.company;

import com.company.deck.DeckBuilder;
import com.company.deck.DeckOfCards;

public class Main {
    public static void main(String[] args) {
        // write your code here
        DeckOfCards myDeck = new DeckOfCards(DeckBuilder.createDeck());
        myDeck.checkDecksize();
        myDeck.shuffleDeck();
        myDeck.printDeck();
    }
}
