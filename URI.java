import java.util.Scanner;

public class URI{

	public static void main (String args[]){
		
		float sal,rest=0,total=0;
		
		Scanner teclado = new Scanner(System.in);
		sal = teclado.nextFloat();
		
		
		if(sal>4500f){
			rest=sal-4500.00f;
			total=(1000*0.08f)+(1500*0.18f)+(rest*0.28f);
			System.out.printf("R$ %.2f\n",total);
			
		}
		else if(sal>=3000.01f && total<=4500.00f){
			rest=sal-3000.00f;
			total=(1000*0.08f)+(rest*0.18f);
			System.out.printf("R$ %.2f\n",total);
		}
		else if(sal>=2000.01f && total<=3000.00f){
			rest=sal-2000.00f;
			total=(rest*0.08f);
			System.out.printf("R$ %.2f\n",total);
		}
		else{
			System.out.println("Isento");
		}
		
	}

}