package org.example;

import ep1.Hospede;

public class Main {
    public static void main(String[] args) {
        Hospede hosp = new Hospede();
        hosp.setNome("João Felipe");

        System.out.println("Hóspede: " + hosp.getNome());
    }
}