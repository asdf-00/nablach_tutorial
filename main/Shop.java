package main;

import java.util.Scanner;
public class Shop{
	public static void main(String[] args){
	
		String[] brand = {"MacBookAir","ThinkpadT450"};
		double[] size = {13.3,15.6};
		double[] price = {9999.8,6789.6};
		int[] count = {0,0};
		
		while(true){
		int choose = chooseFunction();
		switch(choose){
			case 1:
			//?�p?��?����?���@
				printStore(brand,size,price,count);
			break;
			
			case 2:
			//?�p�C��?���I���@
				update(brand,count);
			break;
			
			case 3:
				return;
			
			default:
//				System.out.println("���̋@�\�͂���܂���B");
			break;
			}
		}
	}
	
	public static void update(String[] brand,int[] count){

		Scanner sc = new Scanner(System.in);
		//��?��?
		for(int i=0; i<brand.length; i++){
			System.out.println("�ύX����݌ɐ���" + brand[i] + "���͂��Ă��������B");
			//???���C?��?���C��?��?���I��?��
			int newCount = sc.nextInt();
			count[i] = newCount;
		}
	}
	public static void printStore(String[] brand,double[] size,double[] price,int[] count){
		System.out.println("---------���i�݌Ƀ��X�g---------");
		System.out.println("�^��   �T�C�Y    ���i   ����");
		
		int totalCount = 0;
		int totalMoney = 0;
		for(int i=0; i<brand.length; i++){
			System.out.print(brand[i]+"   "+size[i]+"   "+price[i]+"   "+count[i]);
			totalCount += count[i];
			totalMoney += count[i]*price[i];
			
		}
		System.out.println("���݌ɐ�: "+totalCount);
		System.out.println("���i�݌ɋ��z: "+totalMoney);
	}
	public static int chooseFunction(){
		System.out.println("----------���i�݌ɊǗ�---------");
//		System.out.println("1.�݌Ƀ��X�g�\��");
		System.out.println("2.���i�݌ɐ���ύX");
		System.out.println("3.�ޏo");
		System.out.println("����ԍ�����͂��Ă��������B");
		Scanner sc = new Scanner(System.in);
		int chooseNumber = sc.nextInt();
		return chooseNumber;
	}
}
