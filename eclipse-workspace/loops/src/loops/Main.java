package loops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1'den 10'a kadar Tek sayılar");
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("While döngüsü");
		
		int i=1;
		System.out.println("1'den 10'a kadar Tek sayılar");
		while(i<10) {
			System.out.println(i);
			
			i+=2;
		}
		
		System.out.println("Do-While döngüsü");
		
		int j=100;
		//do-while döngüsünde ilk şart sağlanmasa bile çalışır.Çünkü başında zorunlu do (yap) eylemi vardır.:D
		do {
			System.out.println(j);
			
			j++;
		}while(i<10);

	}

}
