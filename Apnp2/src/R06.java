import java.util.Scanner;
public class R06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int arv1, cresc1, arv2, cresc2, dif, anos;
		
		System.out.println("Digite o tamanho e o crescimento das duas �rvores: ");
		arv1 = teclado.nextInt();
		cresc1 = teclado.nextInt();		
		arv2 = teclado.nextInt();
		cresc2 = teclado.nextInt();
		
		if (arv1 > arv2) {
			dif = arv1 - arv2;
			
			if(cresc1 >= cresc2) {
				System.out.print("nunca");
				
			}else{
				anos = dif /(cresc2-cresc1) + 1;
				
				System.out.print(anos);
			}
		}
		
		if (arv2 > arv1) {
			dif = arv2 - arv1;
			
			if(cresc2 >= cresc1) {
				System.out.print("nunca");
				
			}else {
				anos = dif /(cresc1-cresc2) + 1;
				
				System.out.print(anos);
			}
		}
		if (arv1 == arv2) {
			if(cresc1 == cresc2) {
				System.out.print("nunca");
				
			}else {
				anos = 1;
				
				System.out.print(anos);
			}
			
				
			
		}

	}

}
