import java.util.Scanner;
public class R02{
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int a = 0, b = 1, c, i;
        
        System.out.print(a + " " + b + " ");
        
        for ( i = 0; i <8 ; i++){
            
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
