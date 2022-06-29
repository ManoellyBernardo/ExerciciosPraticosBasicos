public class Exercicio10 {

    /*
     * Faça um programa que mostre o menu de opções a seguir, receba a opção
     * digitada pelo usuário e os dados necessários para executar cada operação.
     * Note que dependendo da opção escolhida pelo usuário, um conjunto de
     * instruções diferente será executado. 
     * 
     * DICA: utilize a estrutura
     * switch para executar conjuntos de instruções diferentes, dependendo da opção
     * escolhida pelo usuário.
     * 
     * Menu de opções:
     * 1. Somar dois números.
     * 2. Número ao quadrado.
     * Digite a opção desejada
     */

     public static void main(String[] args) {
      
        int opcao, numQuadrado, quadrado;
        double num1, num2, soma;

        System.out.println("Menu de opções: \n1. Somar dois números. \n2. Número ao quadrado. \nDigite a opção desejada: ");
        opcao = Integer.parseInt(System.console().readLine());

        switch (opcao) {
            case 1:
                System.out.println("Qual é o primeiro número que você quer somar ? ");
                num1 = Double.parseDouble(System.console().readLine());
                System.out.println("Qual é o segundo número que você quer somar ? ");
                num2 = Double.parseDouble(System.console().readLine());
                soma = num1 + num2;
                System.out.println("A soma do número " + num1 + " com o número " + num2 + " é: " + soma + ".");
                break;
            case 2:
                System.out.println("Qual o número que você deseja ver o seu quadrado ? ");
                numQuadrado = Integer.parseInt(System.console().readLine());
                quadrado = numQuadrado * numQuadrado;
                System.out.println("O quadrado do número " + numQuadrado + " é: " + quadrado + ".");
            default:
                System.out.println("Opção inválida.");
                break;
        }
     }
}
