import java.util.Scanner;
public class R05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, tot =0;
		
		System.out.println("Digite o valor: "); num = teclado.nextInt();
		
		while (num != 0) {
			if (num >= 100 && num <= 200) {
				tot ++;
			}
			num = teclado.nextInt();
		}
		if(num == 0) {
			System.out.print(tot);
		}
		

	}

}
