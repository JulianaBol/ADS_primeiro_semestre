import java.util.Scanner;
public class R04 {
	
	public static void main(String[]args) {
		  Scanner teclado = new Scanner(System.in);
		
		    int inic,fim,a=1,b=0,c=0;

			System.out.println("Digite dois números inteiros positivos: ");
			inic = teclado.nextInt();
			fim = teclado.nextInt();
	
			while (b <= fim){
	            if(b >= inic){
	                System.out.print(b+" ");
	            }
	            c = a;
	            a = b + a;
	            b = c;
	        }
	}

}
