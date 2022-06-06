package com.CardGame.PlayingCard;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuitTest {

    @ParameterizedTest
    @ValueSource(strings = {"hearts", "clubs", "spades", "diamonds"})
    void getSuitAndAssertThatTheyReturnTheCorrectString(String suit) {
        Suit currentSuit = Suit.valueOf(suit.toUpperCase());
        assertEquals(currentSuit.getSuit().toUpperCase(), suit.toUpperCase());
    }

    @ParameterizedTest
    @EnumSource(Suit.class)
    void getAllSuits(Suit suit) {
        ArrayList<Suit> anArrayOfSuits = Suit.getAllSuits();
        assertEquals(anArrayOfSuits.contains(suit), true);

    }
}