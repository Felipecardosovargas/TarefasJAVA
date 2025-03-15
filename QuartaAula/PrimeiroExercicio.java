package QuartaAula;

/*
1) Faça um algoritmo que leia os valores A, B, C e imprima na
tela se a soma de A + B é menor que C.

 */

import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = teclado.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = teclado.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int c = teclado.nextInt();

        int soma = a + b;

        if (soma < c){
            System.out.println("A soma de A + B é menor do que C!");
        } else {
            System.out.println("A soma de A + B não é menor do que C!");
        }
    }
}
