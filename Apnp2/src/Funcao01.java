import java.util.Scanner;
public class Funcao01 {
				
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, maior;
		
		System.out.println("Digite os valores: "); num = teclado.nextInt();
		maior = num;
		 
		if(num == 0) {
			System.out.print("erro");
			return;
		}
				
		while (num != 0) {
			maior = funcao(num, maior);
			num = teclado.nextInt();
			if(num == 0) {
				break;
			}
		}		
		System.out.print(maior);
	}
		
	static int funcao (int n1, int m) {
		if(n1 > m) {
			m = n1;
		}		
		return m;		
	};
}
