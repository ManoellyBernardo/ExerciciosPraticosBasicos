import java.util.Scanner;

public class Exercicio7 {

    //Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada 
    //dessas notas. Para calcular a média ponderada, multiplique cada nota por seus respectivos pesos, some 
    //todos os resultados e divida pela soma dos pesos. Por exemplo, se as notas forem 10, 5 e 6, e os pesos 1,
    //2 e 3, a média final do estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38. Esse 
    //valor deve ser dividido pela soma dos pesos (6), resultando em 6,3.

    public static void main(String[] args) {
    
        double nota1, nota2, nota3, peso1, peso2, peso3, somaNotas, somaPesos, mediaPonderada;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a primeira nota ? ");
        nota1 = scan.nextDouble();

        System.out.println("Qual é o peso da primeira nota ? ");
        peso1 = scan.nextDouble();

        System.out.println("Qual é a segunda nota ? ");
        nota2 = scan.nextDouble();

        System.out.println("Qual é o peso da segunda nota ? ");
        peso2 = scan.nextDouble();

        System.out.println("Qual é a terceira nota ? ");
        nota3 = scan.nextDouble();

        System.out.println("Qual é o peso da terceira nota ? ");
        peso3 = scan.nextDouble();

        somaNotas = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        somaPesos = peso1 + peso2 + peso3;
        mediaPonderada = somaNotas/somaPesos;

        System.out.println("A média ponderada destas nota é " + mediaPonderada);

        scan.close();
    }
    
}
