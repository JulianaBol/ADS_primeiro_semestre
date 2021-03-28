import java.util.Scanner;

public class V05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int fib[] = new int [30];
		int inic, fim, prim, ult, i = 0;
		boolean vazio = true;
								
		fib[0] = 0;
		fib[1] = 1;	
					
		System.out.print("Digite dois números inteiros: ");
		inic = teclado.nextInt();
		fim = teclado.nextInt();
		
		if(inic > fim) {
			System.out.print("erro");
		}
		
		for(i = 2; i < 30; i++) {
			fib[i] = (fib [i-2])+(fib[i-1]);
		}
		
		for(i = 0; i < 30; i++) {
			if(fib[i] <= fim) {
				if(fib[i] >= inic) {
					System.out.print(fib[i]+" ");
					vazio=false;
				}
			}
		}
		for(i=0; i<30;i++) {
			if(vazio=false) {
				
			}
		}
						
	}

}