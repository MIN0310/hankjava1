package com.tom;

public class StringTester {

	public static void main(String[] args) {
		
		int a = Integer.parseInt("10");
		a--;
		System.out.println(a);
		float b = Float.parseFloat("10.5");
		b++;
		System.out.println(b);
		
		String s3 = new String("Jack Tom Eric");
		System.out.println(s3.indexOf("o"));
//		String name = "boss";
//		System.out.println((s3.substring(0,5) + name + s3.substring(8,13)));
		String name = "Tom";
		int index = s3.indexOf(name);
		System.out.println(index);
		System.out.println(s3.substring(0, index) + "boss" + s3.substring(index + name.length()));
		
		String s = "Hello world";
		System.out.println(s.substring(8));
		System.out.println(s.substring(2,9));
		
		for(int i = s.length()-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}

}
