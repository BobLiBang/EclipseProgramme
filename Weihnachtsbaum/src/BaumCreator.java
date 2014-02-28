
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaumCreator {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		int hoehe = 0;
		System.out.println("Wie hoch soll der Baum sein?");
		try {
			hoehe = Integer.parseInt(input.readLine());
		} catch (Exception e) {

			System.exit(-1);
		}
		System.out.println("Es wird ein Baum der Höhe " + hoehe
				+ " gezeichnet.");
		
		int leerzeichen = hoehe - 1;
		int breite = 1;

		while (hoehe > 0) {
			
			for (int verbleibend = leerzeichen; verbleibend != 0; verbleibend--) {
				System.out.print(" ");
			}
			for (int verbleibend = breite; verbleibend != 0; verbleibend--) {
				System.out.print("#");
			}
			System.out.println();
			hoehe--;
			breite += 2;
			leerzeichen--;
		}
		for (int verbleibend = (breite/2)-1; verbleibend != 0; verbleibend--) {
			System.out.print(" ");
		}
		
		System.out.println("#");

	}

}
