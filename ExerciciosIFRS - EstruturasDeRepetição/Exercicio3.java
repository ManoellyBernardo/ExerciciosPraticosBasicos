
public class Exercicio3 {

    // Crie um programa Java para exibir os quadrados de números digitados pelo
    // usuário, até que ele digite um número
    // negativo.

    public static void main(String[] args) {

        int num, numQuadrado;

        System.out.println("Digite aqui o número que você quer o quadrado: ");
        num = Integer.parseInt(System.console().readLine());

        while (num > 0) {
    
            numQuadrado = num * num;
            
            System.out.println("O quadrado de " + num + " é " + numQuadrado + ".");
            
            System.out.println("Digite aqui o número que você quer o quadrado: ");
            num = Integer.parseInt(System.console().readLine());
        }
    }
}
