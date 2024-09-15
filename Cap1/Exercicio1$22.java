import java.util.Scanner;

public class Exercicio1$22 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

      
        double preco= 5.79;

        double desconto = 0.09;
        double precodesconto = preco * desconto;
        double precoavista = preco - precodesconto;

        System.out.printf("Preco de venda com 9%% de desconto: %.2f \n", precoavista);



        scanner.close();
    }

    
}

