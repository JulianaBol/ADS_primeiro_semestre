
import java.util.Scanner;
public class V01{
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        double valor[] = new double [5];
        
        System.out.println("Digite quatro valores: ");
              
        for (int i = 0; i <4; i++){
           
            valor[i] = teclado.nextDouble();
        }
        valor[4] = (valor[0]+ valor[1]+valor[2]+valor[3])/4;
        
        System.out.print(valor[4]);
        
        
    }
}