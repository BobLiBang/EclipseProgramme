import javax.swing.JOptionPane;


public class EingabenundAbfragen
{
	public static void main (String[] args)
	{
		String eingabe = JOptionPane.showInputDialog("Geben sie hier eine beliebige Zahl ein!");
		System.out.println(eingabe);
		int zahl = Integer.parseInt (eingabe);
		int e = zahl + 5;
		System.out.println(e);
		 
		if (e > 10)
		{
			System.out.println("Die zahl ist größer als 10!");
		}
		
		else if (e == 10)
		{
			System.out.println("Die Zahl ist 10!");
		}
		
		else
		{
			System.out.println("Die Zahl ist kleiner als 10!");
			
		}
		
		System.out.print("Sie ist "+e+"!");
		
		if(zahl >= 100)
		{
			System.out.println("Die eingegebene Zahl wahr mindestens 100!");
		}
		
		else 
		{
			System.out.println("Die eingegeben Zahl wahr unter 100!");
		}
		System.out.println("Das bedeutet == gleich >= größergleich <= kleinergleich < kleiner > größer && und!");
		System.out.println("Man kann auch mehrere Bedingungen bei if haben! BSP IF ((E = 345) && (B = true) && (T = STARTEN)) !");
	}

}
