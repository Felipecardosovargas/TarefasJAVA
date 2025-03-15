package SegundaTarefa;

/*
Exercício 1- Peça para que o usuário informe seu nome e idade,
logo após print no console as informações de uma forma
explicativa.
 */

import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Olá, por favor informe seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Agora informe sua idade: ");
        idade = teclado.nextInt();

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
    }
}
