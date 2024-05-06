import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        //TODO: Conhecer e importar a classe Scanner
        
        Scanner abrirConta = new Scanner(System.in);

        //Exibir as menssagens para o usuário
        //Obter pelo scanner os valores digitados no terminal

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = abrirConta.next();

        System.out.print("Digite o número da conta: ");
        int numero = abrirConta.nextInt();
        abrirConta.nextLine(); 

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = abrirConta.next();

        System.out.print("Digite o saldo da conta: ");
        double saldo = abrirConta.nextDouble();

         // Exibir a messagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo);
        System.out.println("Seu saldo já está disponível para saque.");

        
        abrirConta.close();
        
    }
}