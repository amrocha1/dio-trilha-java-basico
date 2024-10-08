import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura de dados do terminal
        Scanner scanner = new Scanner(System.in);
        
        // Solicitação dos dados ao usuário
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt(); // Leitura do número da conta
        
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next(); // Leitura da agência
        
        scanner.nextLine(); // Consumir a nova linha pendente
        
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine(); // Leitura do nome do cliente
        
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble(); // Leitura do saldo
        
// Exibição da mensagem final com as informações
String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                  "sua agência é " + agencia + ", conta " + numero + 
                  " e seu saldo " + saldo + " já está disponível para saque.";

System.out.println(mensagem);

        
        // Fechar o scanner
        scanner.close();
    }
}
