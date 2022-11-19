package SwitchCase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade='E';
		
		switch (grade) {
		case 'A':  System.out.println("Mükemmel");break;
		case 'B': System.out.println("Güzel");break;
		case 'C':System.out.println("İyi");break;
		case 'D':System.out.println("Şartlı geçtin.");break;
		case 'F':System.out.println("Kaldın");break;
		
			
			
		
		default:System.out.println("Yanlış karakter girildi.");break;
			
		}
	}

}
