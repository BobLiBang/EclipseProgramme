import java.util.Scanner;


public class BreakUNDContinue {

	public static void main(String[] args) {
		int zahl;
		int fakultaet=1;
		Scanner s=new Scanner(System.in);
		zahl=s.nextInt();
		
		while(true){
			//Endlosschleife
			if(zahl<=1){
				break;
			}
			fakultaet*=zahl;
			zahl--;
			
		}
		System.out.println(fakultaet);

	}

}
//Continue bricht nur den Schleifen Durchgang ab und startet die Schleife neu!!!