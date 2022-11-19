package Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []ogrenciler = new String [4];
		ogrenciler[0]="İbrahim";
		ogrenciler[1]="Halil";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Pınar";
		
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
		System.out.println("ReCap Demo");
		
	   double[] myNotes = {30.5,21.8,47.9,58.4};
	   
	   double maximum=myNotes[0];
	   double total=0;
	   for (int i = 0; i < myNotes.length; i++) {
		
		   if(maximum<myNotes[i])
			   maximum=myNotes[i];
		   
		   total=total+myNotes[i];
		   
		   
	}
	   System.out.println("Maximum note is "+maximum);
	   System.out.println("Total is "+total);
	}

}
