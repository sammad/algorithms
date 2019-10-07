package com.ms.algo.sorting;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class KnuthShuffle {

	public static void main(String[] args) {
		PlayingCard[] deck = new PlayingCard[]{new PlayingCard(1, Suite.CLUB),
												new PlayingCard(2, Suite.CLUB),
												new PlayingCard(3, Suite.CLUB),
												new PlayingCard(4, Suite.CLUB),
												new PlayingCard(5, Suite.CLUB),
												new PlayingCard(6, Suite.CLUB),
												new PlayingCard(7, Suite.CLUB),
												new PlayingCard(8, Suite.CLUB),
												new PlayingCard(9, Suite.CLUB),
												new PlayingCard(10, Suite.CLUB),
       };
		System.out.println("Before=");
		Arrays.asList(deck).stream().forEach((card)->System.out.println(card));
		shuffleDeck(deck);
		System.out.println("After=");
		Arrays.asList(deck).stream().forEach((card)->System.out.println(card));
	}

	private static void shuffleDeck(PlayingCard[] deck) {
		for(int idx=0; idx<deck.length;idx++){
			if(idx>0){
				int r= ThreadLocalRandom.current().nextInt(idx);
				exchange(deck,idx,r);
			}
		}

	}

	private static void exchange(PlayingCard[] deck, int idx, int r) {
		PlayingCard temp = deck[idx];
		deck[idx]=deck[r];
		deck[r] =temp;
	}
}

class PlayingCard{
	private int number;
	private Suite suite;
	
	public PlayingCard(int number, Suite suite) {
		super();
		this.number = number;
		this.suite = suite;
	}

	public int getNumber() {
		return number;
	}

	public Suite getSuite() {
		return suite;
	}

	@Override
	public String toString() {
		return "PlayingCard [number=" + number + ", suite=" + suite + "]";
	}
	
}

enum Suite{
	CLUB,SPADE,HEARTS,BRICK
}
