import java.util.Scanner;;

public class Exercicio1$21 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        
        System.out.printf("Digite um numero inteiro");
        int num = scanner.nextInt();

        int sucessor = num + 1;
        int ant = num -1;

        System.out.printf("Sucessor de %d :%d \n", num, sucessor);
        System.out.printf("Antecessor de %d :%d \n",num , ant);


        scanner.close();
    }

    
}