import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class Primzahlenrechner {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner x = new Scanner(System.in);
		System.out.println("Wie viele Primzahlen sollen berechnet werden?");
		long WievielePrimzahlen = x.nextLong();
		
		long PrimZahlen=0;
		long beiZahl=1;
		boolean isPrim;
		int d = 0;
		final int f=10;
		
		long Zeile = 1;
		long Anzahl = 10;
		
		
		File g = new File("C://Users//Moritz König//Die ersten 100.000 Primzahlen.txt");
		Formatter z = null;
		
		
		
		while(true){
			if(PrimZahlen>=WievielePrimzahlen){
				break;
			}
			beiZahl++;
			isPrim=true;
			
			for(int i=2; i<(beiZahl/2); i++){
				if(beiZahl%i==0){
					isPrim=false;
				}
			}
			
			if(isPrim==true){
				System.out.print(beiZahl+" ; ");
				z = new Formatter(g);
				z.format(beiZahl+" ; ");
				PrimZahlen++;
				d++;
				if(d==f){
					System.out.println(" Zeile "+Zeile+" und bis Zahl "+Anzahl);
					z = new Formatter(g);
					z.format(" Zeile "+Zeile+" und bis Zahl "+Anzahl);
					d=0;
					Zeile++;
					Anzahl+=10;
				}
				
				}
			
			}
			
		
		System.out.println("Done");

	}}

