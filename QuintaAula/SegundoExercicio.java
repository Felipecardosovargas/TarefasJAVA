package QuintaAula;

/*
2) Crie um número “Randomicamente” usando a classe
Random do java, em seguida crie um algoritmo usando um
laço de repetição onde o usuário vai digitar um número
qualquer. O laço deve encerrar quando o usuário acertar o
número criado randomicamente. Para dar dicas ao usuário,
printar na tela “MAIOR” quando o número randômico for
menor que o número digitado pelo usuário, caso contrário
printar na tela “MENOR”
 */

import java.util.Random;
import java.util.Scanner;

public class SegundoExercicio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random numAleatorio = new Random();

        int numero = numAleatorio.nextInt(100);
        int userNum;

        System.out.println("Tente adivinhar o número (entre 0 e 99):");

        do {
            System.out.print("Digite um número: ");
            userNum = teclado.nextInt();

            if (userNum > numero) {
                System.out.println("O número é menor!");
            } else if (userNum < numero) {
                System.out.println("O número é maior!");
            }

        } while (userNum != numero);

        System.out.println("Parabéns! Você acertou o número: " + numero);

        teclado.close();
    }
}
