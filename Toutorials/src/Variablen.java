
public class Variablen {
	public static void main (String[] args)
	{
		int zahl;
		zahl = 16234;
		System.out.print("int : ");
		System.out.println(zahl);
		
		double dezi = 1.23452; 
		System.out.print("double : ");
		System.out.println(dezi);
		
		boolean a, b;
        a = true;
		b= zahl<20000 && a==true;
		
		System.out.print("boolean : ");
		System.out.println(a);
		
		String t = "STRING = TEXT!!!";
		System.out.print("String : ");
		System.out.println(t);
		
		System.out.println("Meine Zahl lautet : "+zahl+". Meine Aussage wahr "+a+".");
		
		int z1 = 20;
		int z2 = 80;
		
		int e1 = z1 + z2;
		int e2 = z1 - z2;
		int e3 = z1 * z2;
		int e4 = z2 / z1;
		
		System.out.println("");
		
		System.out.println("e1 = "+e1);
		System.out.println("e2 = "+e2);
		System.out.println("e3 = "+e3);
		System.out.println("e4 = "+e4);
		
		// arrav 
		
		int[] y =new int[10];
		
		y[0] = 2;
		y[1] = 5;
		y[2] = 1;
		y[3] = 8;
		y[4] = 3;
		y[5] = 9;
		y[6] = 5;
		y[7] = 4;
		y[8] = 7;
		y[9] = 2;
		
		
	}

}
