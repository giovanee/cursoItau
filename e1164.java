import java.util.Scanner;

public class e1164{

	public static void main (String args[]){
		Scanner teclado = new Scanner(System.in);
		int x =0,y=0,result=0;
		
		x = teclado.nextInt();
		for(int i = 1;i<=x;i++){
		y= teclado.nextInt();	
		
			for(int j = 1;j<=y;j++){
				int re=y%j;
				
				if(y%j==0 && j!=y){
					result = result +j;
				}
			}
			if(result==y){
				System.out.println(y + " eh perfeito");
				result=0;
			}
			else{
				System.out.println(y + " nao eh perfeito");
				result=0;
			}
		}
	
	}

}