import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor digite o numero da agencia");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor digite a agencia");
        String agencia = sc.nextLine();
        System.out.println("Por favor digite o seu nome");
        String NomeCliente = sc.nextLine().toUpperCase();
        System.out.println("Por favor digite o saldo");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e saldo " + saldo);

    }
}
