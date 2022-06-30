public class Exercicio4 {

    // Escreva um programa em Java que calcule as raízes de uma equação de segundo
    // grau utilizando a fórmula de Báskara. A equação de segundo grau é uma equação
    // no formato Ax2 + Bx + C. O usuário deve informar os valores para A, B e C.

    public static void main(String[] args) {

        double valorA, valorB, valorC, delta, x1, x2;

        System.out.println("Informe o valor de A: ");
        valorA = Double.parseDouble(System.console().readLine());

        System.out.println("Informe o valor de B: ");
        valorB = Double.parseDouble(System.console().readLine());

        System.out.println("Informe o valor de C: ");
        valorC = Double.parseDouble(System.console().readLine());

        delta = Math.pow(valorB, 2) - (4 * valorA * valorC);

        if (delta < 0) {

            System.out.println("Inexiste raíz real.");

        } else if (delta > 0) {

            x1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);

            x2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);

            System.out.println("Essa equação tem duas raízes diferentes que são : ");
            System.out.println(x1 + " e " + x2);

        } else if (delta == 0) {

            x1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);

            System.out.println("Essa equação possui uma unica raíz, que é: ");
            System.out.println(x1);

        }
    }
}
