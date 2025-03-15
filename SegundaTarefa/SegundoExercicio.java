package SegundaTarefa;

import java.util.Scanner;

/*
Exercício 2- Peça para que usuário informe números, através do
Scanner, e faça algum tipo de cálculo. Podendo qualquer uma das
operações aprendidas em aula, em seguida printar o resultado no
console.
 */
public class SegundoExercicio {
    public static void main(String[] args) {

        int num1;
        int num2;
        int res;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = teclado.nextInt();

        res = num1 + num2;

        System.out.println("O resultado da soma é: "+res);
    }
}
