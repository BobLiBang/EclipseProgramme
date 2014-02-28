import java.util.Scanner;

import javax.swing.JOptionPane;


public class ConsolenRechner {

	public static void main(String[] args) {
		boolean x = false;
		while(x == false){
			Scanner s = new Scanner(System.in);
		System.out.println("Geben sie bitte eine Zahl ein!");
		double a = s.nextDouble();
		System.out.println("Geben sie bitte eine Zahl ein!");
		double b = s.nextDouble();
		System.out.println("Geben sie nun das Rechenzeichen ein! + - * /");
		String c = s.next();
		
		if(c.equals("+")){
			double e = a + b;
			System.out.println("Das Ergebnis ist " + e + " !");
			}
		else if(c.equals("-")){
			double e = a - b;
			System.out.println("Das Ergebnis ist " + e + " !");
			}
		else if (c.equals("*")){
			double e = a * b;
			System.out.println("Das Ergebnis ist " + e + " !");
			}
		else if(c.equals("/")){
			double e = a / b;
			System.out.println("Das Ergebnis ist " + e + " !");
			}
		else{}
		
		String y = JOptionPane.showInputDialog("Weiter rechnen? JA/NEIN");
		if(y.equals("NEIN")){
		x = true;
		}
		else {}
		
		}
		

	}

}
