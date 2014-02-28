import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class SSP {
	public static boolean besp;
	public static boolean bmsp;
	public static boolean end;
	public static JFrame frame = new JFrame("SSP");
	public static void main(String[] args) {
		Start();
		
		
	}

	private static void Start(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(2,2));
		JButton esp = new JButton();
		esp.setText("Einzelspieler");
		JButton msp = new JButton();
		msp.setText("Mehrspieler");
		
		JLabel text1 = new JLabel("Herzlich Willkommen bei Schere, Stein, Papier!");
		JLabel text2 = new JLabel("oder");
		text2.setHorizontalAlignment(JLabel.CENTER);
		text1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(text2,BorderLayout.CENTER);
		panel.add(esp,BorderLayout.EAST);
		panel.add(msp,BorderLayout.WEST);
		panel.add(text1,BorderLayout.NORTH);
		frame.add(panel);
		frame.setSize(400,250);
		frame.setVisible(true);
		;
		esp.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Singleplayer();
			}
			
		});
		msp.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Multiplayer();

			}
			
		});
		
	}
	
	private static void Multiplayer() {
		
		
		System.out.println("Tastenbelegung Spieler 1 :");
		System.out.println("q -> Schere");
		System.out.println("w -> Stein");
		System.out.println("e -> Papier");
		System.out.println();
		System.out.println("Tastenbelegung Spieler 2:");
		System.out.println("i -> Schere");
		System.out.println("o -> Stein");
		System.out.println("p -> Papier");
		System.out.println();
		System.out.println("Ende -> Ende");
		
		
		
		while(true){
			
			System.out.println("Wählt bitte euer Zeichen. Erst Spieler 1, dann 2.");
			
			Scanner s = new Scanner(System.in);
			
			String Entscheidung1 = s.next();
			String Entscheidung2 = s.next();
			
			
		}
		
	}

	private static void Singleplayer() {
		JFrame frame2 = new JFrame("Singleplayer");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JButton schere = new JButton("Schere");
		JButton stein = new JButton("Stein");
		JButton papier = new JButton("Papier");
		panel.add(stein,BorderLayout.CENTER);
		panel.add(schere,BorderLayout.WEST);
		panel.add(papier,BorderLayout.EAST);
		frame2.add(panel);
		frame2.setSize(300,200);
		frame2.setVisible(true);
		
		/*Scanner s = new Scanner(System.in);

		System.out.println("Tastenbelegung:");
		System.out.println("q -> Schere");
		System.out.println("w -> Stein");
		System.out.println("e -> Papier");
		System.out.println("Ende -> Ende");
		int runde = 1;
		boolean tuf;
		int win = 0;
		int lose = 0;
		int drawn = 0;

		while (true) {
			tuf = true;
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Runde "+ runde);
			System.out.println("Was wirst du nehmen?");
			runde++;
			String entscheidung2 = s.next();

			if(entscheidung2.equalsIgnoreCase("q")){
				System.out.println("Schere");
			}
			else if(entscheidung2.equalsIgnoreCase("w")){
				System.out.println("Stein");
			}
			else if(entscheidung2.equalsIgnoreCase("e")){
				System.out.println("Papier");
			}
			else if(entscheidung2.equalsIgnoreCase("ende")){
				break;
			}
			else{
				System.out.println("Gib ein gültiges Zeichen aus der Legende ein(q , w , e)!");
				tuf = false;
				runde-=1;
			}
			
			int r = (int) (Math.random() * 3 + 1);
			
			
			  1 ist Papier 2 ist Schere 3 ist Stein
			 
			if(tuf == true){
			if(r == 2){
				System.out.println("Schere");
			}
			else if(r == 3){
				System.out.println("Stein");
			}
			else if(r == 1){
				System.out.println("Papier");
			}
			else{
				
			}
			}
			else{
				
			}
			if (entscheidung2.equalsIgnoreCase("q") && r == 1
					|| entscheidung2.equalsIgnoreCase("w") && r == 2
					|| entscheidung2.equalsIgnoreCase("e") && r == 3) {
				System.out.println("Du hast gewonnen!");
				win++;
			} else if (entscheidung2.equalsIgnoreCase("q") && r == 3
					|| entscheidung2.equalsIgnoreCase("w") && r == 1
					|| entscheidung2.equalsIgnoreCase("e") && r == 2) {
				System.out.println("Du hast verloren");
				lose++;
			} else if (entscheidung2.equalsIgnoreCase("q") && r == 2
					|| entscheidung2.equalsIgnoreCase("w") && r == 3
					|| entscheidung2.equalsIgnoreCase("e") && r == 1) {
				System.out.println("Das war ein Unentschieden!");
				drawn++;
			} else {
				
			}

		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Siege : "+win+" | Niederlagen : "+lose+" | Unentschieden : "+drawn);
		
	*/}
	
}
