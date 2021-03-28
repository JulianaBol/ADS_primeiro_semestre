import java.util.Scanner;
public class S03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double n1, n2, n3, n4, soma, media;
		
		System.out.println("Digite quatro valores positivos: ");
		
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		n3 = teclado.nextInt();
		n4 = teclado.nextInt();
		
		soma = n1 + n2 + n3 + n4;
		media = soma / 4;
		
		System.out.print("A média aritmética entre os valores é "+ media);
	}

}
