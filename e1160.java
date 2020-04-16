import java.util.Scanner;

public class e1160{

	public static void main (String args[]){
		Scanner teclado = new Scanner(System.in);
		int n =0,ano=0,pa=0,pb=0;
		double g1=0,g2=0;
		
		n = teclado.nextInt();
		
		for(int i =0;i<n;i++){
			pa = teclado.nextInt();
			pb = teclado.nextInt();
			g1 = teclado.nextDouble();
			g2 = teclado.nextDouble();
			
			while(pa<=pb){
				pa=(int)(pa*(1+(g1/100)));
				if(g2==0f)pb=pb;
				else pb=(int)(pb*(1+(g2/100)));
				ano=ano +1 ;
				if(ano>100){
					System.out.println("Mais de 1 seculo.");
					break;
				}
			}
			
			if(ano<=100)System.out.println(ano+" anos.");
		
			ano=0;
			
		}
	
	}

}