package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int idadeLucas = 21;
        String disponibilidade = "Tarde";
        String nacionalidade = "Brasileiro";

        if(cadastro(idadeLucas,disponibilidade,nacionalidade)){
            System.out.println("Cadastro concluido");
        }else {
            System.out.println("Cadastro nao aprovado");
        }

    }

    private static boolean cadastro(int idadeLucas, String disponibilidade, String nacionalidade) {
        if(verificarIdade(idadeLucas)){
            if(verificarTarde(disponibilidade)) {
                if(verificarBrasileiro(nacionalidade)){
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    private static boolean verificarIdade(int idadeLucas) {
        if (idadeLucas >= 18) {
            System.out.println("Idade maior que 18 anos");
            return true;
        } else {
            System.out.println("Idade menor que 18 anos");
            return false;
        }
    }

    private static boolean verificarTarde(String disponibilidade) {
        if (disponibilidade == "Tarde") {
            System.out.println("Disponibilidade aprovada");
            return true;
        } else {
            System.out.println("Disponibilidade nao aprovada");
            return false;
        }
    }

    private static boolean verificarBrasileiro(String nacionalidade) {
        if (nacionalidade == "Brasileiro") {
            System.out.println("Nacionalidade aprovada");
            return true;
        } else {
            System.out.println("Nacionalidade nao aprovada");
            return false;
        }
    }


}

/**
 * //imprimindo uma frase usando variaveis
 * int idadeJoao = 21;
 * int idadePedro = 35;
 * String nomeJoao = "João";
 * String nomePedro = "Pedro";
 * <p>
 * System.out.println("O usuario " + nomeJoao + " tem " + idadeJoao + " anos de idade, e o usuario " + nomePedro + "tem " + idadePedro + " anos de idade.");
 * <p>
 * <p>
 * //calcule a area do trapézio
 * int B = 12;
 * int b = 15;
 * int h = 10;
 * System.out.println("A area do trapézio é: " + (B + b) * h / 2);
 * <p>
 * System.out.println("");
 * System.out.println("");
 * <p>
 * //construa um cadastro de usuario, considerando os criterios:
 * //precisa ter idade entre 18 e 60 anos
 * //precisa ser brasileiro
 * //precisa ter disponibilidade no periodo da tarde
 * //caso 1 dos criterios nao seja valido, o sistema deve parar a verificação e mostrar que o usuario nao pode se cadastrar pelo motivo especifico
 * <p>
 * Scanner input = new Scanner(System.in);
 * <p>
 * String nome = "joao";
 * String nacionalidade = "Brasileiro";
 * String disponibilidade = "Tarde";
 * int idade = 21;
 * <p>
 * if (idade < 18 || idade > 60) {
 * System.out.println("idade nao aprovado ");
 * } else {
 * if (nacionalidade != "Brasileiro") {
 * System.out.println("Nacionalidade nao brasileira");
 * <p>
 * } else {
 * if (disponibilidade != "Tarde") {
 * System.out.println("Disponibilidade fodida");
 * } else {
 * System.out.println("Cadastro infelizmente aprovado");
 * }
 * }
 * }
 * <p>
 * }
 **/