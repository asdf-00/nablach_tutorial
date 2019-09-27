package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserSizedArray {
	public static void main(String[] argv) throws Exception {
	
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));

		int size;
		System.out.println("Enter size");
		size = new Double(cin.readLine()).intValue();
		int[] score = new int[size];

		int i;
		System.out.println("Enter the value");
		for (i = 0; i < size; i++)
			score[i] = new Double(cin.readLine()).intValue();

		for (i = 0; i < size; i++)
			System.out.print("" + score[i] + ' ');
		System.out.println();
	}
}
