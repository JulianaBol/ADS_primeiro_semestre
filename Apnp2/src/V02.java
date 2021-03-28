import java.util.Scanner;
public class V02 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		double maior, menor, soma=0, alunoc, alunoa;
		double nota[]= new double[10];
		
		System.out.println("Digite as notas dos alunos: ");
		
		for (int i=0; i<10; i++ ) {
		
			nota[i]=teclado.nextDouble();
		}
		
		maior=nota[0];	
		menor=nota[0];	
		alunoc=alunoa=1;
		
		for (int i=0; i<10; i++ ) {
			if(nota[i]>maior) {
				maior=nota[i];
				alunoa=i+1;
			}
			if(nota[i]<menor) {
				menor=nota[i];
				alunoc=i+1;
			}
			
		}
				
		System.out.printf("%.0f %.2f %.0f %.2f", alunoc, menor, alunoa, maior);
		
	}
}
