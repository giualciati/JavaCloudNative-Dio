import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu saldo inicial?");
        double saldoInicio = entrada.nextDouble();
    
        System.out.println("Digite o valor da primeira transação(insira - antes do valor para saque)");
        saldoInicio += entrada.nextDouble();
    
        System.out.println("Digite o valor da segunda transação(insira - antes do valor para saque)");
        saldoInicio += entrada.nextDouble();
    
        System.out.println("Digite o valor da terceira transação(insira - antes do valor para saque)");
        saldoInicio += entrada.nextDouble();
    
        double saldoFinal = saldoInicio;
    
        System.out.printf("%.2f\n", saldoFinal);
    
    
        entrada.close();
    }
}