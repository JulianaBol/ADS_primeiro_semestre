
public class ExercicioExtra3 {

	public static void main(String[] args) {

		int i = 0, cont = 9;
		int num[] = new int [10];
			
		while (i < 10) {
			num[i] = i;
			System.out.print(num[i]);
			i++;
		}		
		System.out.println(" ");
		
		while(cont > 0) {
			for (i = 0; i < cont; i++) {
				System.out.print(num[i]);
			}
			
			System.out.println(" ");
			cont--;
		}		
	}
}
