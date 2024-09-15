import java.util.Scanner;

public class Exercicio1$10 {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Valor da base maior: ");
        int bm = scanner.nextInt();

        System.out.print("Valor da base menor: ");
        int bmn = scanner.nextInt();

        System.out.print("Valor da altura: ");
        int altura = scanner.nextInt();

        
        
        int area = (bm+bmn)*altura/2;

        
      
        System.out.println("Area = " + area);

        
        scanner.close();
    }
}
