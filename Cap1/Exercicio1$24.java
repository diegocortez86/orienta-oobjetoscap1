public class Exercicio1$24 {

    public static void main(String[] args) {
        
        double vl = 20.78;
        double aulas = 40;
        double inss = 26.5;
        double bruto = vl*aulas;
        double desc = bruto * (inss / 100);
       
       double liquido = bruto - desc;

       System.out.printf("Salario Liquido: %.2f\n",liquido);

    }
}