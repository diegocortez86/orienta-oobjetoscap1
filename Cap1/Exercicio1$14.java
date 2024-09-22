import java.util.Scanner;

public class Exercicio1$14 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = input.nextDouble();  

      
        double perimetro = lado * 4;
        double area = lado * lado;

        
        System.out.printf("Perímetro = %.2f\n", perimetro);
        System.out.printf("Área = %.2f\n", area);

        input.close();
    }
}
