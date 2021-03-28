import java.util.Scanner;
public class R03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N, totDiv = 0;
		
		System.out.print("Digite um número: "); N = teclado.nextInt();
		
		for (int i = 1; i < N; i++) {
			if (N % i == 0) {
				totDiv = totDiv + i;
			}
		}
		if (totDiv == N) {
			System.out.print("sim");
		}else {
			System.out.print("não");
		}
	}
}
