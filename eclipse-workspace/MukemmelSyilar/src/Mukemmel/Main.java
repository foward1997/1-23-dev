package Mukemmel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi=28;
		int toplam=0;
		for(int i=1;i<sayi;i++) {
			
			if(sayi%i==0)
			toplam=toplam+i;
		}
		if(toplam==sayi)
			System.out.println(sayi+" mükemmel sayıdır.");
		else
			System.out.println(sayi+" mükemmel sayı değildir.");
		
	}

}
