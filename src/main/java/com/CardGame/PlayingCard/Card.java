package com.CardGame.PlayingCard;

import lombok.Getter;

@Getter
public class Card {
    //   isAbleTo -  A card should have a suit, a number value between that of 1,13 and if is face card,
    //    has the correct representation
    private final Suit suit;
    private final Integer numberValue;
    private final String numberRepresentation;

    public Card(Suit suit, Integer numberValue) throws Exception {
        this.suit = suit;
        this.numberValue = numberValue;
        this.numberRepresentation = getNumberCardOrNot(numberValue);
    }


    static String getNumberCardOrNot(Integer num) throws Exception {
        boolean notAValidNumber = (num < 1 || num > 13);
        try {
            if (notAValidNumber) {
                throw new Exception("no can do");
            }
        } catch (Exception e) {
            System.out.printf("%s : %s is not a valid number for a card, range between 1-13\n", e, num);
            throw e;
        }
        switch (num) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return num.toString();
        }
    }

    @Override
    public String toString() {
        try {
            return String.format("%s of %s", getNumberCardOrNot(this.getNumberValue()), this.suit).toUpperCase();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
