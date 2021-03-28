import java.util.Scanner;
public class V062{
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int conj[] = new int [10];
		int cont = 0, i = 1;
		
		System.out.println("Digite os números: "); 
		conj[0] = teclado.nextInt();
		
		while(i < conj.length && conj[i] != 0) {
			conj[i] = teclado.nextInt();
			for(int j = 0; j < i; j++) {
				if(conj[i] == conj[j]) {
					i--;
				}
			}
		}
		
		/*for(i = 1; i < conj.length && conj[i-1] !=0; i++) {
			conj[i] = teclado.nextInt();
			
			for(int j=0;j<i;j++) {
				if(conj[i]== conj[j]) {
					i--;
				}
			}
		}*/
		while(cont <  conj.length && conj[cont] !=0) {
			System.out.print(conj[cont]+" ");
		}
		
		/*for(i = 0; i < conj.length && conj[i] !=0; i++) {
			System.out.print(conj[i]+" ");
		}*/
		for(int valor:conj) {
			if(valor==0) {
				System.out.print("0");
				return;
			}
		}
	}
}