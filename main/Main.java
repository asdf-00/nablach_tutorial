package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
//		System.out.println("組数を入力");

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("各組に数を入力");
//		String a = bf.readLine();
		int b = Integer.parseInt(bf.readLine());
		int[] n= new int[b];
		try {
			
			for(int i=1; i<=n.length; i++) {
				
				String c = bf.readLine();
//				n[i] =  bf.readLine();
//				System.out.println(c);
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
			
	}
}