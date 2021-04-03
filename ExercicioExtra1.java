import java.util.Scanner;
public class ExercicioExtra1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num[] = new int [20];
		int i = 0, j = 19;
		
		System.out.println("Digite 20 valores: ");
		
		while(i < num.length) {
			num[i] = input.nextInt();
			i++;
		}
		for(i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		for(i = 0; i < 10; i++) {
			int aux = num[i];
			num[i] = num[j];
			num [j] = aux;
			j--;
		}
		System.out.println(" ");
		for(i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
}
