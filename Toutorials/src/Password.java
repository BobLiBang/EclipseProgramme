import java.util.Scanner;


public class Password {
	public static void main(String[] args) {
		System.out.println("Bitte gib hier ein Password ein!");
		Scanner s = new Scanner(System.in);
		String p = s.next();
		System.out.println("Password eingeben!");
		String o = s.next();
		
		if(p.equals(o)){
			System.out.println("Richtig!");
		}
		
		else {
			System.out.println("Falsch!");
		}
	}
	

}
