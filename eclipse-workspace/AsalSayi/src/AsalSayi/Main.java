package AsalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sayi=5;
		int adet=0;
		
		for(int i=1;i<sayi;i++) {
			
			if(sayi%i==0)
				adet++;
			
		}
		if(adet==1)
		System.out.println("Sayı asal sayıdır.");
		else {
			
			System.out.println("Asal sayı değildir.");
		}
	}

}
