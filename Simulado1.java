import java.util.Scanner;
public class Simulado1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int vet[] = new int [20];
		int aux, i = 0 ;
		System.out.println("Digite vinte valores inteiros:");

		while(i < vet.length) {
			vet[i] = input.nextInt();
			i++;
		}
		for(i = 0; i < vet.length ; i+=2) {
			aux = vet[i];
			vet[i]= vet[i+1];
			vet[i+1]= aux;
			System.out.print(vet[i]+" "+ vet[i+1]+" ");
		}
	}
}

