import java.util.Scanner;
public class Simulado2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, contDiv, totPrimo = 0;
		
		System.out.println("Digite os valores: "); num = input.nextInt();
		
		while (num != 0) {
			contDiv = 0;
			for(int i = 1; i <= num; i++) {
				if( num % i == 0) {
					contDiv++;				
				}				
			}
			if(contDiv == 2) {
				totPrimo++;
			}
			num = input.nextInt();			
		}		
		System.out.print(totPrimo);
	}
}
