import java.util.Scanner;
public class R09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int inic, fim, cont, i, div = 0, soma = 0;
		
		
		System.out.println("Digite dois valores: ");
		inic = teclado.nextInt();
		fim  = teclado.nextInt();
		
		i = fim - inic;
		int conj[] = new int [i];
		
		for(cont = 0; cont < conj.length; cont ++) {
			conj[cont] = inic;
						
			inic++;
			
		}
		for(int num:conj) {
			for( int j =1; j <= num; j++) {
				if(num % j == 0) {
					div++;
				}
			}
			if(div == 2) {
				soma += num;
			}
			div = 0;
		}
		if (i == 0) {
			System.out.print(i);
		}else {
			System.out.print(soma);
		}
	}

}
