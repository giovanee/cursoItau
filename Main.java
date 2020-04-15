import java.util.Scanner;

public class Main{

	public static void main (String args[]){
		Scanner teclado = new Scanner(System.in);
		int x =0,alc=0,gas=0,die=0;
		
		
		while(x!=4){
			x = teclado.nextInt();
			
			if(x>0){
				if(x==1){
					alc=alc+1;
				}
				else if (x==2){
					gas=gas+1;
				}
				else if(x==3){
					die=die+1;
				}
			}
			
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alc);
		System.out.println("Gasolina: "+gas);
		System.out.println("Diesel: "+die);
	
	}

}