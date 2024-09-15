import java.util.Scanner;

public class Exercicio1$20 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.printf("Primeiro numero:");
        int num1 = scanner.nextInt();

        System.out.printf("Segundo numero:");
        int num2 = scanner.nextInt();

         int media = (num1+num2)/2;

         System.out.printf("Media aritimetica é: %d", media);

         scanner.close();



    }

    
}