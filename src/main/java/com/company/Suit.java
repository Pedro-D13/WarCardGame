package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public enum Suit {
    HEARTS("hearts") {
        @Override
        public String getSuit() {
            return "hearts";
        }
    },
    SPADES("spades") {
        @Override
        public String getSuit() {
            return "spades";
        }

    },
    CLUBS("clubs") {
        @Override
        public String getSuit() {
            return "clubs";
        }
    },
    DIAMONDS("clubs") {
        @Override
        public String getSuit() {
            return "clubs";
        }
    };

    private String currentSuit;

    Suit(String suit) {
        this.currentSuit = suit;
    }


    public String getSuit() {
        return this.currentSuit;
    }

    static public ArrayList<Suit> getAllSuits() {
        return new ArrayList<Suit>(Arrays.asList(HEARTS, DIAMONDS, SPADES, CLUBS));
    }
}
