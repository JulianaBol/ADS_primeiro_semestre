import java.util.Scanner;
public class V03 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int i, alunos, acima = 0;
		double percent, media = 0;
		double nota[]= new double[20];
		
		System.out.println("Digite a quantidade de alunos e as notas: ");
		alunos = teclado.nextInt();
		
		for(i = 0; i < alunos; i++) {
			nota[i] = teclado.nextDouble();
			media = media + nota[i];
		}		
		
		media = media / alunos;
		
		for(i = 0; i < alunos; i++) {
			if (nota[i] > media) {
				acima++;			
			}
		}
				
		percent = (acima * 100)/ alunos;
		
		System.out.printf("%.1f%s",percent,"%");		
						
	}

}
