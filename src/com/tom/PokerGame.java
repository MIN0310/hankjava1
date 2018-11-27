package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
        
		int flowers[] = {0x2660, 0x2665, 0x2666, 0x2663};
        int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};	
		
		int nums[] = new int[5];
		nums[0] = 55;
		nums[3] = 80;
		System.out.println(nums[3]);
		System.out.println(nums.length);
		
		for(int i = 0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
		char f = 0x2660;
		System.out.println(f);
		
		Random random = new Random();
		int number = random.nextInt(13) + 1;
		System.out.print(number);

		int flower = random.nextInt(4);

		char c = 0;
		switch (flower) {
			case 0:
				c = 'S';
				break;
			case 1:
				c = 'H';
				break;
			case 2:
				c = 'D';
				break;
			case 3:
				c = 'C';
				break;

		}
		System.out.println(c);

	}
}
