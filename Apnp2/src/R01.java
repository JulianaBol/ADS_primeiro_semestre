import java.util.Scanner;
public class R01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N, i, contDiv = 0;
		
		System.out.println("Digite um n�mero: ");
		N = teclado.nextInt();
		
		for (i = 1; i <= N; i++) {
			if (N % i ==0) {
				contDiv++;
			}
		}
		if (contDiv > 2) {
			System.out.print("N�o � primo");
		}else {
			System.out.print("� primo");
		}

	}

}
