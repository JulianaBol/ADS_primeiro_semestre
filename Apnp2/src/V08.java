import java.util.Scanner;
public class V08{
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int conj[] = new int [10];
		int i, repet = 1, num=0, maior = 0;
		
		System.out.println("Digite os números: "); 
		conj[0] = teclado.nextInt();
		
		for(i = 1; i < conj.length && conj[i-1] !=0; i++) {
			conj[i] = teclado.nextInt();
			
			for(int j = 0; j < i; j++) {
				if(conj[j] == conj[i]) {
					repet++;
					if(maior < repet) {
						maior = repet;
						num = conj[j];
					}
					if(maior == repet) {
						
					}
				}
			}
			
			repet = 1;
		}
		if(num == 0) {
			System.out.print(num);
		}else {
			System.out.print(num+" "+maior);
		}				
	}
}