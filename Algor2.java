import java.util.Scanner;

public class Algor2{

	public static void main (String args[]){
		
		int H;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Categoria Eleitoral");
		
		System.out.print("Digite sua idade: ");
		H=teclado.nextInt();
		System.out.println();
		
		
		if(H < 16){
			System.out.print("não eleitores menores de 16 anos de idade");
		}
		else if(H>18 && H<=65){
			System.out.print("obrigatorios entre 18 e 65 anos");
		}
		else if ((H>= 16 && H<18) || (H>65)){
			System.out.print("facultativos entre 16 e 18 e maiores de 65 anos");
		}
		
		System.out.println();
	}
}
		