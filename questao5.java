public class questao5 {

    /*
     * Construa a tabela de multiplicação de números de 1 a 10 (ex.: 1 x 1 = 1, 1 x
     * 2 = 2, etc.).
     */
    public static void main(String[] args) {

        int i, j;

        for (i = 1; i <= 10; i++) {

            System.out.println("Tab. de " + i);

            for (j = 1; j <= 10; j++) {

                System.out.println(i + " x " + j + " = " + (i * j));

            }
        }

    }

}
