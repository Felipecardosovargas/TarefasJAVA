package QuintaAula;

/*
5) Crie um algoritmo que receba um número do usuário,
depois printar na tela todos os números pares até o número
digitado.
 */

import java.util.Scanner;

public class QuintoExercicio {
    public static void main(String[] args) {

        int i = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int userNum = teclado.nextInt();

        while (i <= userNum) {
            if (i % 2 ==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
