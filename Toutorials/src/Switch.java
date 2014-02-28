import java.util.Scanner;


public class Switch {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int antwort;
		System.out.println("Wie viele Monde hat die Erde?");
		antwort = x.nextInt();
		switch(antwort){
		case 0:
			System.out.println("Leider zu wenig!");
			break;
		case 1:
			System.out.println("Richtig!");
			break;
		case 2:
			System.out.println("Leider zu viel!");
			break;
		default:
			System.out.println("FALSCH");
			break;
		}

	}

}
