import java.util.Scanner;


public class DurchschnittRechner {
	public static void main(String[] agrs){
		Scanner s = new Scanner(System.in);
		System.out.println("Wie viele Zahlen wollen sie eingeben?");
		int x = s.nextInt();
		double[] d = new double[x];
		int t = x-1;
		int e = t;
		double p =x;
		while(true){
			Scanner w = new Scanner(System.in);
			d[t]= w.nextDouble();
			System.out.println(d[t]);
			t--;
			if(t==-1){
				break;
			}
			
		}
		double durchschnitt ;
		double gesamt =0;
		while(true){
			gesamt+= d[e]; 
			e--;
			if(e==-1){
				break;
			}
			
		}
		durchschnitt=gesamt/p;
		System.out.println(durchschnitt);
		
	}

}
