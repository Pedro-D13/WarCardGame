package com.CardGame.Deck;

import com.CardGame.PlayingCard.Card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DeckOfCards {
    private ArrayList<Card> deckOfCards;

    public DeckOfCards(ArrayList<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void checkFirstCard() {
        System.out.println(this.deckOfCards.get(0));
    }

    public void getFirstCard() {
//        this.deckOfCards = new
    }

    public void checkDecksize() {
        System.out.println(this.deckOfCards.size());
    }

    public void shuffleDeck() {
        Collections.shuffle(this.deckOfCards);
    }

    public void printDeck() {
        Arrays.stream(getDeckOfCards().toArray()).forEach(System.out::println);
    }


    @Override
    public String toString() {
        return "DeckOfCards{" +
                "totalNumberOfCards=" + deckOfCards.size() +
                '}';
    }
}
