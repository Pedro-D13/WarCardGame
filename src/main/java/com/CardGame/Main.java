package com.CardGame;

//@SpringBootApplication
//public class Main {
//    public static void main(String[] args){
//        SpringApplication.run(Main.class,args);
//    }
//}

import com.CardGame.Deck.DeckBuilder;
import com.CardGame.Deck.DeckOfCards;

public class Main {
    public static void main(String[] args) {
        // write your code here
        DeckOfCards myDeck = new DeckOfCards(DeckBuilder.createDeck());
        myDeck.checkDecksize();
        myDeck.shuffleDeck();
        myDeck.printDeck();
    }
}
