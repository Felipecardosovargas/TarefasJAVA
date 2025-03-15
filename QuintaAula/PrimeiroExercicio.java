package QuintaAula;


/*
1) Crie um algoritmo que imprima na tela os números de 0 a
100 que são pares.
 */
public class PrimeiroExercicio {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
