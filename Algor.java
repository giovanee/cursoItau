import java.util.Scanner;

public class Algor{

	public static void main (String args[]){
		
		float H, peso;
		int S;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculo de Peso Ideal");
		
		System.out.print("Digite sua altura: ");
		H=teclado.nextFloat();
		System.out.println();
		
		System.out.print("Digitar 1 para Homem ou 2 para Mulher: ");
		S=teclado.nextInt();
		System.out.println();
		
		if(S == 1){
			peso = (72.7f*H)-58.00f;
		}
		else{
			peso = (62.1f*H)-44.7f;
		}
		
		System.out.println("Peso Ideal: "+ peso);
	}
}
		