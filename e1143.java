import java.util.Scanner;

public class e1143{

	public static void main (String args[]){
		Scanner teclado = new Scanner(System.in);
		int x =0,x1=1,x2=1,x3=1;
		
		x = teclado.nextInt();
		for(int i = 1;i<=x;i++){
			
			System.out.println(x1 +" "+x2+" "+x3);
			x1=x1+1;
			x2=x1*x1;
			x3=x1*x1*x1;
		}
	
	}

}