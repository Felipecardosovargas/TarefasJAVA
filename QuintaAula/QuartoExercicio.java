package QuintaAula;

/*
4) Crie um algoritmo que receba idade de 5 pessoas, em
seguida printar na tela o total de pessoas que têm idade maior
que 18 anos.
 */

import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int maiorIdade = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da " + i + "° pessoa: ");
            int idade = teclado.nextInt();
            if (idade > 18) {
                maiorIdade += 1;
            }
        }
        System.out.println("Tem "+maiorIdade+" pessoas com mais de dezoito anos");
    }
}