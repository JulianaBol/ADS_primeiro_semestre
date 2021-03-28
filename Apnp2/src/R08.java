import java.util.Scanner;
public class R08 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int num, positivo=0, negativo=0, par=0, impar=0;
        
		System.out.println("Digite um número: ");num=teclado.nextInt();
		
		while(num!=0){
                   if(num>0) {
                	   positivo++;
                   }
                   if(num<0) {
                	   negativo++;
                   }
                   if(num%2==0) {
                	   par++;
                   }else {
                	   impar++;
                   }
                   num=teclado.nextInt();
               }
		while(num==0){
			System.out.println(positivo+" - "+negativo+" - "+par+" - "+impar);
            return;              									
		}
	}
}

