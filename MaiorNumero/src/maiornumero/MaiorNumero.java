
package maiornumero;
import java.util.*;
/**
 *
 * @author taina-santos
 */
public class MaiorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Digite um número:");
        num1 = in.nextInt();
        System.out.println("Digite um segundo número:");
        num2 = in.nextInt();
        
        
           if(num1>num2){
             System.out.print("O maior é:" + num1);  
           } else 
             System.out.print("O maior é:" + num2);
      
           
    }
    
}
