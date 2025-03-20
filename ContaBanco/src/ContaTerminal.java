import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         // Scanner para entrada de dados pelo terminal
         Scanner scanner = new Scanner(System.in);

         // Solicitar número da conta
         System.out.println("Por favor, digite o número da Conta:");
         int numero = scanner.nextInt();
 
         // Solicitar agência
         System.out.println("Por favor, digite o número da Agência:");
         scanner.nextLine(); // Consumir quebra de linha
         String agencia = scanner.nextLine();
 
         // Solicitar nome do cliente
         System.out.println("Por favor, digite o Nome do Cliente:");
         String nomeCliente = scanner.nextLine();
 
         // Solicitar saldo
         System.out.println("Por favor, digite o Saldo:");
         double saldo = scanner.nextDouble();
 
         // Exibir mensagem final (concatenação)
         System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
         System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
 
         scanner.close();
     }
 }
