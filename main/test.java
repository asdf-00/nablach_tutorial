package main;
import java.io.*;
public class test {
	public static void main(String[] args) throws Exception {
		System.out.println("組数を入力");

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("各組に数を入力");
//		String a = bf.readLine();
		int b = Integer.parseInt(bf.readLine());

		String[] name = new String[b];
		System.out.println("組の名前を入力");
		for (int i = 0; i < name.length-1; i++) {
			name[i] = bf.readLine();
				System.out.println("組の名前は" + name[i+1] + "です。");
		}

		System.out.println("各組の人数を入力");
//		int[] n = new int[b];

//		for (int i = 0; i < n.length; i++) {
//			int e = Integer.parseInt(bf.readLine());
//
//				System.out.println(c);
//		}

		int[] f = new int[b];
		int sum = 0;
		for (int i = 0; i <= f.length-1; i++) {
			System.out.println((i + 1) + "番目の組の人数");
			f[i] = Integer.parseInt(bf.readLine());
			sum += f[i];
		}

		System.out.println("【結果表示】");
		System.out.println("組名" + "     " + "入場者数" + sum + "　　　　　" + "売上額");
		System.out.println("**************************");
//		System.out.println( + "     " + "     " + "\\");
//		System.out.println( + "     " + "     " + "\\");
//		System.out.println( + "     " + "     " + "\\");
//		System.out.println("**************************");
//		System.out.println("入場者合計:" + );
//		System.out.println("売上額合計:" + );
//		System.out.println("売上額平均:" + );
//		System.out.println("平均購入金額:" + );
	}
}
