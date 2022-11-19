package Strings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mesaj="Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		
		/*System.out.println("Eleman sayısı: "+mesaj.length());
		System.out.println("4.eleman "+mesaj.charAt(3));
		System.out.println(mesaj.concat("Yaşasın"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler =new char[9];
		mesaj.getChars(0, 9, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf('a'));*/
		
		String yeniMesaj=mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime:mesaj.split(" ")) {
			
			System.out.println(kelime);
			
		}
		
	}

}
