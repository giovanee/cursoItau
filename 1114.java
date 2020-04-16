import java.util.Scanner;

public class e1114{

	public static void main (String args[]){
		Scanner teclado = new Scanner(System.in);
		int x =0;
		
		
		while(x!=2002){
			x = teclado.nextInt();
			
			if(x!=2002){
				System.out.println("Senha Invalida");
			}
			else{
				System.out.println("Acesso Permitido");
			}
			
		}
	
	}

}