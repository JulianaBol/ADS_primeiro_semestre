import java.util.Scanner;
public class R07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int inic, fim, num, tot = 0;
		
		System.out.println("Digite o intervalo e os valores: ");
		inic = teclado.nextInt();
		fim = teclado.nextInt();
		
		num = teclado.nextInt();
		
		while(num!=0){
			if(inic < fim) {
				if(num >= inic && num <= fim) {
					tot++;
				}
            }else {
            	if(fim < inic) {
            		if( num >= fim && num <= inic) {
            			tot++;
            		}
            	}
            }
            num=teclado.nextInt();
        }
		
        while(num==0){
            System.out.println(tot);
       		return;
        }
	}
}
