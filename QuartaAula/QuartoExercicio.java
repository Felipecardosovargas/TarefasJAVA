package QuartaAula;

import java.util.Scanner;

/*
4) Faça um algoritmo que leia dois valores inteiros A e B se
os valores forem iguais deverá se somar os dois, caso
contrário multiplique A por B. Ao final de qualquer um dos
cálculos deve-se atribuir o resultado para uma variável C e
mostrar seu conteúdo na tela.
 */
public class QuartoExercicio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número A: ");
        int a = teclado.nextInt();

        System.out.print("Digite o número B: ");
        int b = teclado.nextInt();

        if (a == b) {
            int c = a + b;
            System.out.println("O resultado da soma é: "+c);
        } else {
            int c = a * b;
            System.out.println("O resultado da multiplicação é: "+c);
        }
    }
}
