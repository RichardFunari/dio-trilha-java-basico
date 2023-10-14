import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela classe Scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada


        //criação do ojbeto scanner

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua agência");
            String agencia = scanner.next();

            System.out.println("Digite o número da conta");
            int numeroConta = scanner.nextInt();

            System.out.println("Saldo disponível para saque é de:");
            double saldoConta = scanner.nextDouble();


            //imprimir os dados obtidos pelo usuário
            System.out.println("Olá " + nome + " " + sobrenome + ",");
            System.out.println("obrigado por criar uma conta em nosso banco. Sua agência é: " + agencia + ",");
            System.out.println("sua conta é: " + numeroConta);
            System.out.println("e o seu saldo de " + saldoConta + " já está disponível para saque.");
        }


    }
}
