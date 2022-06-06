package com.CardGame.PlayingCard;

import java.util.ArrayList;
import java.util.Arrays;



public enum Suit {
    HEARTS("HEARTS") {
        @Override
        public String getSuit() {
            return "hearts";
        }
    },
    SPADES("SPADES") {
        @Override
        public String getSuit() {
            return "spades";
        }

    },
        CLUBS("CLUBS") {
        @Override
        public String getSuit() {
            return "clubs";
        }
    },
    DIAMONDS("DIAMONDS") {
        @Override
        public String getSuit() {
            return "diamonds";
        }
    };

    private String currentSuit;

    Suit(String suit) {
        this.currentSuit = suit.toUpperCase();
    }


    public String getSuit() {
        return this.currentSuit.toUpperCase();
    }

    static public ArrayList<Suit> getAllSuits() {
        return new ArrayList<>(Arrays.asList(HEARTS, DIAMONDS, SPADES, CLUBS));
    }
}
