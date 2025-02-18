import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double saldo = entrada.nextDouble();

        if(saldo < 0){
            System.out.println("Negativado");
        }else if (saldo >= 0 && saldo <= 500){
            System.out.println("Baixo");
        }else{
            System.out.println("Confortável");
        }

        entrada.close();
    }
    
}
