package ep2;
import java.util.*;


public class TesteHospede {
    public static void main(String[] args) {
        Hospede hospede = new Hospede();
        hospede.setNome("João Felipe");
        hospede.setSobrenome("Martins Santana");

        System.out.println("Nome: " + hospede.getNome());
        System.out.println("Sobrenome: " + hospede.getSobrenome());

        Hospede hospede2 = new Hospede();
        hospede2.setNome("Aparecido");
        hospede2.setSobrenome("José Santana");

        System.out.println("\nNome: " + hospede2.getNome());
        System.out.println("Sobrenome: " + hospede2.getSobrenome());

        Date data = new Date();
        ArrayList lista = new ArrayList();
    }
}
