import java.util.Scanner;

public class QuersummenRechner {

	public static void main(String[] args) {
		int zahl, Quersumme;
		Quersumme = 0;
		Scanner s = new Scanner(System.in);
		zahl = s.nextInt();
		while(true){
			if(zahl<=0){
				break;
			}
			Quersumme+=zahl%10;
			zahl/=10;
		}
		System.out.println(Quersumme);
		
		

	}

}
