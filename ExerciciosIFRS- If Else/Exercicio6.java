import java.util.Scanner;

public class Exercicio6 {
    
    //Desenvolva um programa que leia três valores numéricos inteiros, identifique e apresente o maior valor informado.

    public static void main(String[] args) {
        
        int num, numMaior = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            
            System.out.println("Digite o " + (i + 1) + "° número: ");
            num = scan.nextInt();

            if (num > numMaior) {
                numMaior = num;
            }
        }

        System.out.println("O maior número informado foi: " + numMaior);

        scan.close();
    }
}
