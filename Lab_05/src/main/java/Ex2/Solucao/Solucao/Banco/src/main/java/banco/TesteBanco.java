package Ex2.Solucao.Solucao.Banco.src.main.java.banco;

public class TesteBanco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Bruno", "Henrique");
        System.out.println("Criando o cliente " + cliente);

        cliente.setConta(new Conta(50000));
        System.out.println("Criando uma conta com saldo inicial de R$ " + cliente.getConta().getSaldo());


        System.out.println("Sacando R$1200,00: " + cliente.getConta().sacar(1200));

        System.out.println("Depositando R$8.525,00: " + cliente.getConta().depositar(8525));

        System.out.println("Sacando R$12.800,00: " + cliente.getConta().sacar(12800));

        System.out.println("Sacando R$50.000,00: " + cliente.getConta().sacar(50000));


        System.out.println("O saldo da conta é R$ " + cliente.getConta().getSaldo());


    }
}
