import java.util.Scanner;


public class malohnemalHA {
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	int x = multi(a,b);
	System.out.println(x);
}
static int multi(int a, int b){
	int l�sung = 0;
	for(int i = 0; i < b; i++)
		l�sung+=a;
	return l�sung;
}
}

