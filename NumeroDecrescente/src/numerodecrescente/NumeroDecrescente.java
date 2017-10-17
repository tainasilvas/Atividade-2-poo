
package numerodecrescente;
import java.util.*;
/**
 *
 * @author taina-santos
 */
public class NumeroDecrescente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
        int num;
        int i;
        
        System.out.println("Digite um número:");
        num = in.nextInt();
        
        System.out.print("A sequencia decrescente do número "+ num + " é:");
        
        for(i=num; i>(-1); i--){
            
            System.out.print("\n"+i+"\n");
            
        }
        
        
       
        
    }
    
}
