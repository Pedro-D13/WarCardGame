package com.company;

public class Cards {
    private final Suit suit;
    private final Integer numberValue;
    private final String numberRepresentation;

    public Cards(Suit suit, Integer numberValue) {
        this.suit = suit;
        this.numberValue = numberValue;
        this.numberRepresentation = setNumberCardOrNot(numberValue);
    }

    private String setNumberCardOrNot(Integer numberCardOrNot) {
        switch (numberCardOrNot) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return numberCardOrNot.toString();
        }

    }


    @Override
    public String toString() {
        return String.format("%s of %s", this.numberRepresentation, this.suit).toUpperCase();
    }
}
