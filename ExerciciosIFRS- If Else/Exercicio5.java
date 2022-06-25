import java.util.Scanner;

public class Exercicio5 {
    
    //Desenvolva um programa que leia quatro valores numéricos inteiros e mostre os valores que são divisíveis por 2 e 3.

    public static void main(String[] args) {
        
        int num = 0, cont = 1;

        Scanner scan = new Scanner(System.in);

        while (cont <= 4) {
            System.out.println("Digite aqui o " + cont + "° valor: ");
            num = scan.nextInt();
            cont++;
            if (num % 2 == 0) {
                System.out.println("O número " + num + " é divisível por 2.");
            }
            if (num % 3 == 0) {
                System.out.println("O número " + num + " é divisível por 3.");
            }
        }

        scan.close();
    }
}
