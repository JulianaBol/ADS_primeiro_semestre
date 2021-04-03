import java.util.Scanner;
import java.util.Arrays;
public class ExercicioExtra5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int vet[] = new int [5];
		int esq= 0, dir = vet.length-1, meio = (esq + dir)/2, mediana;
		
		
		System.out.println("Digite cinco valores inteiros positivos:");
		
		for(int i=0; i < 5; i++) {
			vet[i]= input.nextInt();
		}
		Arrays.sort(vet);
		
		mediana = vet[meio];
		
		System.out.print(mediana);		
	}
}
