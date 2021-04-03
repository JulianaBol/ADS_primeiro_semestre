import java.util.Scanner;
public class ExercicioExtra2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1[] = new int [10];
		int num2[] = new int [10];
		int num3[] = new int [10];
		int i = 0;
		
		System.out.println("Digite 20 valores: ");
		
		while(i < num1.length) {
			num1[i] = input.nextInt();
			i++;
		}
		i = 0;
		while(i < num2.length) {
			num2[i] = input.nextInt();
			i++;
		}
		for(i=0; i<num1.length; i++) {
			System.out.print(num1[i]+" ");
		}
		System.out.println(" ");
		
		for(i=0; i<num2.length; i++) {
			System.out.print(num2[i]+" ");
		}
		System.out.println(" ");
		
		for(i = 0; i < num3.length; i++) {
			num3[i] = num1[i] + num2[i];
			System.out.print(num3[i]+" ");
		}
	}
}
