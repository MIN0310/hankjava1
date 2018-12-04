package com.tom;

public class Poker {
	int[] cards = new int[52];

	public Poker() {
		for (int i = 0; i < 52; i++) {
			cards[i] = i;
		}
	}

	public void print() {
		for (int i = 0; i < 52; i++) {
			int flower = cards[i]/13;
			char c = 0;
			switch (flower) {
			case 0:
				c = 0x2660;
				break;
			case 1:
				c = 0x2665;
				break;
			case 2:
				c = '\u2666';
				break;
			case 3:
				c = '\u2663';
				break;
			}
			System.out.print(cards[i] % 13 + 1 + "" + c + " ");
			if (i % 13 == 12)
				System.out.println();
		}
	}

}
