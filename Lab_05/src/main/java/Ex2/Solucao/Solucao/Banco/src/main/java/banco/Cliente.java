package Ex2.Solucao.Solucao.Banco.src.main.java.banco;

public class Cliente {
    private String name;
    private String lastName;

    private Conta conta = new Conta(0);

    public Cliente (String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
