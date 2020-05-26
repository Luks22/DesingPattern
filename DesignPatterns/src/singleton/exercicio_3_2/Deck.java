package singleton.exercicio_3_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private static Deck deck = null;
	
	private Deck() {
		cards = new ArrayList<Card>();
		Suit[] suits = { Suit.SPADES, Suit.HEARTS, Suit.CLUBS,

				Suit.DIAMONDS };
		for (Suit suit : suits) {
			for (int i = 2; i <= 14; i++) {
				cards.add(new Card(suit, i));
			}
		}

		Collections.shuffle(cards, new Random());
	}
	
	public static synchronized Deck getInstance() {
		if(deck == null) {
			deck = new Deck();
		}
		
		return deck;
	}

	public void print() {
		for (Card card : cards) {
			card.print();
		}
	}

	private List<Card> cards;
}
