public class ExercicioExtra4 {

	public static void main(String[] args) {

		int i = 0, cont = 9, aux = 1;
		int num[] = new int [10];
			
		while (i < 10) {
			num[i] = i;
			System.out.print(num[i]);
			i++;
		}			
		System.out.println(" ");
		
		while(cont > 0) {
			for (i = aux; i < 10; i++) {
				System.out.print(num[i]);
			}
			aux++;
			
			System.out.println(" ");
			cont--;
		}		
	}
}
