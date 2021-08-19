import java.util.Scanner;

/*
Determine as raízes de uma equação de 2º grau: ax2 + bx + c = 0 
(recordar que o discriminante Δ = b2 – 4ac, e que a raiz r = (–b ± √Δ)/2a).
*/

public class Questao1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double a, b, c, delta;
        double r1, r2;

        System.out.println("Digite o valor de a:");
        a = leitor.nextDouble();
        System.out.println("Digite o valor de b:");
        b = leitor.nextDouble();
        System.out.println("Digite o valor de c:");
        c = leitor.nextDouble();
        delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Não há raízes");
        } else if (delta == 0) {
            r1 = (-b) / (2 * a);
            System.out.println("A única raiz é: " + r1);
        } else {
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são: " + r1 + " e " + r2);
        }

    }

}
