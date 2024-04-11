package Ex2.Solucao.Solucao.Banco.src.main.java.banco;
import java.util.Scanner;
import Ex2.Solucao.Solucao.Banco.src.main.java.banco.Cliente;
public class TesteBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Nome do cliente: ");
        String name = scanner.nextLine();
        System.out.println("Sobrenome do cliente: ");
        String lastName = scanner.nextLine();
        Cliente cl1 = new Cliente(name, lastName);
        System.out.println("Criando o cliente " + cl1.getName() +" " + cl1.getLastName());

        System.out.println("\nInforme o saldo inicial da conta do cliente: ");
        Double saldoInicial = scanner.nextDouble();
        Conta c1 = new Conta(saldoInicial);
        cl1.setConta(c1);
        System.out.println("Criando uma conta com saldo inicial de R$ " + cl1.getConta().getSaldo());

        System.out.println("\nInforme o valor do saque: ");
        Double saque1 = scanner.nextDouble();
        cl1.getConta().sacar(saque1);
        System.out.println("Saque realizado com sucesso ! O saldo da conta agora é de R$" + cl1.getConta().getSaldo());

        System.out.println("\nInforme o valor do depósito: ");
        Double dep1 = scanner.nextDouble();
        cl1.getConta().depositar(dep1);
        System.out.println("Depósito realizado com sucesso ! O novo saldo da conta é de R$" + cl1.getConta().getSaldo());

        System.out.println("\nInforme o valor do novo saque: ");
        Double saque2 = scanner.nextDouble();
        cl1.getConta().sacar(saque2);
        System.out.println("Saque realizado com sucesso ! O saldo da conta agora é de R$" + cl1.getConta().getSaldo());

        System.out.println("\nInforme o valor do novo depósito: ");
        Double dep2 = scanner.nextDouble();
        cl1.getConta().depositar(dep2);
        System.out.println("Depósito realizado com sucesso ! O novo saldo da conta é de R$" + cl1.getConta().getSaldo());

        System.out.println("\n\nAo final das operações realizadas, o saldo da conta é de R$" + cl1.getConta().getSaldo());

    }
}
