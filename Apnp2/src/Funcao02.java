import java.util.Scanner;
public class Funcao02 {
				
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, menor;
		
		System.out.println("Digite os valores: "); num = teclado.nextInt();
		menor = num;
		 
		if(num == 0) {
			System.out.print("erro");
			return;
		}
				
		while (num != 0) {
			menor = funcao(num, menor);
			num = teclado.nextInt();
			if(num == 0) {
				break;
			}
		}		
		System.out.print(menor);
	}
		
	static int funcao (int n1, int m) {
		if(n1 < m) {
			m = n1;
		}		
		return m;		
	};
}