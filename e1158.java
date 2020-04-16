import java.util.Scanner;

public class e1158{

	public static void main (String args[]){
		Scanner teclado = new Scanner(System.in);
		int n =0,x=0,y=0,a1=0,k=0,con=0;
		
		n = teclado.nextInt();
		for(int i = 1;i<=n;i++){
			x= teclado.nextInt();
			y= teclado.nextInt();
			k=x;con=0;a1=0;
			do{
				if(k%2==0){
					k=++k;
				}
				else{
					a1=a1+k;
					con=++con;
					k=++k;
				}
				
			}while(con<y);
			System.out.println(a1);
		}
	
	}

}