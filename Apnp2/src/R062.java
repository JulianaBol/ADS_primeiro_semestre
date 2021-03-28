import java.util.Scanner;
public class R062 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int arv1, cresc1, arv2, cresc2, anos = 0;
		
		System.out.println("Digite o tamanho e o crescimento das duas árvores: ");
		arv1 = teclado.nextInt();
		cresc1 = teclado.nextInt();		
		arv2 = teclado.nextInt();
		cresc2 = teclado.nextInt();
		
		if (arv1 > arv2) {
			if(cresc1 >= cresc2) {
				System.out.print("nunca");
				
			}else {
				while(arv2 <= arv1) {
				arv2 = arv2 + cresc2;
				arv1 = arv1 + cresc1;
				anos++;
				}
				
				System.out.print(anos);
				return;
			}
		}
		if (arv2 > arv1) {
			if(cresc2 >= cresc1) {
				System.out.print("nunca");
				
			}else {
				while(arv1 <= arv2) {
				arv2 = arv2 + cresc2;
				arv1 = arv1 + cresc1;
				anos++;
				}
				
				System.out.print(anos);
			}
		}
		if (arv1 == arv2) {
			if (cresc1 > cresc2 || cresc2 > cresc1) {
				anos = 1;
				
				System.out.print(anos);
			
			}else {
				System.out.print("nunca");
				
			}
		}
		
		
	}
		
}