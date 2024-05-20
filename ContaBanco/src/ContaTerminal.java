import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência !");
            int NumeroAgencia = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Conta !");
            String NumeroConta = scanner.next();
        
        System.out.println("Por favor, digite seu nome !");
            String NomeCliente = scanner.next();
        
        System.out.println("Por favor, digite seu saldo !");
            Double Saldo = scanner.nextDouble();
        
        System.out.println("Olá "+ NomeCliente +"obrigado por criar uma conta em nosso banco, sua agência é "+ NumeroAgencia + ", conta " + NumeroConta + " e seu saldo " + Saldo +" já está disponível para saque");

    }
}
