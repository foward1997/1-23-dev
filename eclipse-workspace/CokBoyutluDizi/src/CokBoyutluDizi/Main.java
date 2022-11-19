package CokBoyutluDizi;

public class Main {

	public static void main(String[] args) {
		String [][]sehirler =new String [3][3];
		
		sehirler[0][0]="İstanbul";
		sehirler[0][1]="Ankara";
		sehirler[0][2]="Hakkari";
		sehirler[1][0]="Eskişehir";
		sehirler[1][1]="Erzurum";
		sehirler[1][2]="Erzincan";
		sehirler[2][0]="Denizli";
		sehirler[2][1]="Diyarbakır";
		sehirler[2][2]="Düzce";
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("-----------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
			
		}
	}

}
