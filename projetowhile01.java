/**
 * projetowhile01
 */
import java.util.Scanner;
public class projetowhile01 {

    

public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int n;

    System.out.println("Digite o número máximo para contagem");
    n = teclado.nextInt();
    
    
   int contagem;
   contagem = 1;



    while(contagem<=n){
        System.out.println(contagem);
        contagem = contagem + 1;
    }
    


teclado.close();

}
}
