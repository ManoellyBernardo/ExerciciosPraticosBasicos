import java.util.Scanner;

public class Exercicio9 {
    
    //A nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, a um trabalho de 
    //laboratório, a uma avaliação semestral e a um exame final. A média das três notas mencionadas obedece aos pesos a 
    //seguir:
    //Nota - Peso
    //Trabalho de laboratório - 2
    //Avaliação semestral - 3
    //Exame final - 5
    //Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito que segue a tabela:
    //Média Ponderada - Conceito
    //8,0 (inclusive) a 10,0 (inclusive) - A
    //7,0 (inclusive) a 8,0 - B
    //6,0 (inclusive) a 7,0 - C
    //5,0 (inclusive) a 6,0 - D
    //0,0 (inclusive) a 5,0 - E

    public static void main(String[] args) {
        
        double nota1, nota2, nota3, media;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a 1° nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Digite a 2° nota: ");
        nota2 = scan.nextDouble();

        System.out.println("Digite a 3° nota: ");
        nota3 = scan.nextDouble();

        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/(2+3+5);

        if (media >= 8.0 && media <= 10.0) {
            System.out.println("Conceito A.");
        } else if (media >= 7.0 && media < 8.0) {
            System.out.println("Conceito B.");
        } else if (media >= 6.0 && media < 7.0) {
            System.out.println("Conceito C.");
        } else if (media >= 5.0 && media < 6.0) {
            System.out.println("Conceito D");
        } else if (media >= 0 && media < 5.0) {
            System.out.println("Conceito E.");
        } else {
            System.out.println("Nota inválida!");   
        }

        scan.close();
    }
}
