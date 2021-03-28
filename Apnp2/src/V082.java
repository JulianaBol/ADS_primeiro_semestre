import java.util.Scanner;
public class V082 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int conj[] = new int [10];
		int i, repet = 1, num=0, maior = 0, c = 0;
		
		System.out.println("Digite os números: "); 
		conj[0] = teclado.nextInt();
		
		for(i = 1; i < conj.length && conj[i-1] !=0; i++) {
			conj[i] = teclado.nextInt();
		}
		
		for(i = 0; i < conj.length-1 && conj[i] !=0; i++) {
			repet = 1;			
			for(int j = i+1; j < conj.length; j++ ) {
				if(conj[i] == conj[j]) {
					repet++;
					if(maior < repet) {
						maior = repet;
						num = conj[i];
						c = i;
					}else if(maior == repet) {
						if(c > i) {
							c = i;
							num = conj[i];
						}
					}
				}
			}
		}
		if(num == 0) {
			System.out.print(num);
		}else {
			System.out.print(num+" "+maior);
		}			
	}
}
