package QuartaAula;

import java.util.Scanner;

/*
7) Escreva um algoritmo que leia três valores inteiros e
diferentes e mostre-os em ordem decrescente.
 */

public class SetimoExercicio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = teclado.nextInt();

        if (num1 != num2 && num1 != num3 && num2 != num3) {
            int maior, meio, menor;

            if (num1 > num2 && num1 > num3) {
                maior = num1;
                meio = (num2 > num3) ? num2 : num3;
                menor = (num2 < num3) ? num2 : num3;
            } else if (num2 > num1 && num2 > num3) {
                maior = num2;
                meio = (num1 > num3) ? num1 : num3;
                menor = (num1 < num3) ? num1 : num3;
            } else {
                maior = num3;
                meio = (num1 > num2) ? num1 : num2;
                menor = (num1 < num2) ? num1 : num2;
            }

            System.out.println("Números em ordem decrescente: " + maior + ", " + meio + ", " + menor);
        } else {
            System.out.println("Os números devem ser diferentes!");
        }

        teclado.close();
    }
}