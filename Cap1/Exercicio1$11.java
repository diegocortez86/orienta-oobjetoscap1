import java.util.Scanner;

public class Exercicio1$11 {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Valor da diagonal maior: ");
        int bm = scanner.nextInt();

        System.out.print("Valor da diagonal menor: ");
        int bmn = scanner.nextInt();

       

        
        
        int area = bm*bmn/2;

        
        
        System.out.println("Area = " + area);

        
        scanner.close();
    }
}
