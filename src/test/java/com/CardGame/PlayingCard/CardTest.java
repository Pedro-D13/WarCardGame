package com.CardGame.PlayingCard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardTest {


    @ParameterizedTest
    @EnumSource(Suit.class)
    void cardHasASuit(Suit suit) throws Exception {
        final Card aCard = new Card(suit, 1);
        assert (aCard.toString().contains(suit.toString().toUpperCase()));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5, 6, 7, 8, 9, 10})
    void cardValueIsValid(Integer num) throws Exception {
        final Card aCard = new Card(Suit.DIAMONDS, num);
        assertEquals(aCard.getNumberValue(), num);
        assert (aCard.getNumberValue() >= 1);
        assert (aCard.getNumberValue() <= 13);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 14, Integer.MAX_VALUE, Integer.MIN_VALUE})
    void cardValueIsValidOtherwiseThrowError(Integer num) {
        Assertions.assertThrows( Exception.class, () -> {
            Card aCard =new Card(Suit.DIAMONDS, num);
            Card.getNumberCardOrNot(aCard.getNumberValue());

        });
    }

}