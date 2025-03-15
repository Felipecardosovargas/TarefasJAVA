package QuintaAula;

/*
3) Crie um algoritmo que lê do usuário um número de 1 a 10,
em seguida, usando laço de repetição print a tabuada do
número digitado.
 */

import java.util.Scanner;

public class Terceiroexercicio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num = 0;

        System.out.print("Digite um número: ");
        num = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            int res = num*i;
            System.out.println(num+" X "+i+" = "+res);
        }
    }
}
