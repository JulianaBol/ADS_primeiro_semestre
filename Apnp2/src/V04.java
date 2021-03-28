
public class V04 {

	public static void main(String[] args) {
		
		int fib[] = new int [30];
		
		fib[0] = 0;
		fib[1] = 1;
		
		System.out.print(fib[0]+" "+fib[1]+" ");
		
		for(int i = 2; i <30; i++) {
			fib[i] = (fib [i-2])+(fib[i-1]);
			System.out.print(fib[i]+" ");
		}

	}

}
