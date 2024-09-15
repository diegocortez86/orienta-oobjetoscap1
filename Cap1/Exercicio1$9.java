import java.util.Scanner;

public class Exercicio1$9 {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Valor da base: ");
        int base = scanner.nextInt();

        System.out.print("Valor da altura: ");
        int altura = scanner.nextInt();

        
        
        int area = base * altura / 2;

        
       
        System.out.println("Area = " + area);

        
        scanner.close();
    }
}
