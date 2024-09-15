import java.util.Scanner;

public class Exercicio1$8 {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Valor da largura: ");
        int largura = scanner.nextInt();

        System.out.print("Valor da altura: ");
        int altura = scanner.nextInt();

        
        int perimetro = (2 * largura) + (2 * altura);
        int area = largura * altura;

        
        System.out.println("Perimetro = " + perimetro);
        System.out.println("Area = " + area);

        
        scanner.close();
    }
}
