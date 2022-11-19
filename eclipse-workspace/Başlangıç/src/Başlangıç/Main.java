package Başlangıç;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		String ortaMetin ="İlginizi çekebilir.";
		String altMetin ="Vade";
		
		System.out.println(ortaMetin);
		
		int vade =12;
		
		double dolarBugun=18.16;
		double dolarDun=18.10;
		
		if(dolarBugun>dolarDun)
			System.out.println("Dolar Yükseldi.");
		else {
			System.out.println("Dolar düştü.");
		}
		
		String[] Krediler= {"Öğrenci Kredisi","Maaş Kredi","Emekli Kredi"};
		
		for(int i=0;i<Krediler.length;i++) {
			System.out.println(Krediler[i]);
		}
		
		
	}

}
