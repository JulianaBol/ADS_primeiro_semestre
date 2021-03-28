import java.util.Scanner;
public class S01 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, prod;
		
		System.out.print("Digite dois números inteiros");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		prod = num1 * num2;
		
		System.out.print("O produto entre " + num1 + " e " + num2 + " é " + prod + "!");
	}

}
