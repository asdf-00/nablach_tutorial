package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ArraySample02 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("生徒数を入力してください。");
        int num = Integer.parseInt(br.readLine());    //要素数を入力する

        int[] a =new int[num];    //配列を生成する

        System.out.println("人数分の得点を入力してください。");
//        int sum = 0;
        for(int i = 0; i < a.length; i++){
//            System.out.print((i + 1) + "番の人の得点 : ");
            a[i] = Integer.parseInt(br.readLine());
//            sum += a[i];
            System.out.println( a[i] + "点です。");
        }

//        for(int i = 0; i < a.length; i++){
//            System.out.println((i + 1) + "番の人の得点は" + a[i] + "点です。");
//        }
//        System.out.println("合計は" + sum +"点です。");
//        System.out.println("平均は" + (double)sum / num +"点です。");
    }
}