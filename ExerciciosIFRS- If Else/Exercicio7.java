import java.util.Scanner;

public class Exercicio7 {

    //Faça um programa que leia três valores numéricos inteiros, identifique e apresente o menor valor informado.

    public static void main(String[] args) {
        
        int num = 0, cont = 0, numMenor = 0;

        Scanner scan = new Scanner(System.in);

        while (cont < 3) {
           
            System.out.println("Digite o " + (cont + 1) + "° número: ");
            num = scan.nextInt();

            if (num < numMenor) {
                numMenor = num;
            }
            
            cont++;

        }            

        System.out.println("O menor número informado foi: " + numMenor);


        scan.close();
    }
    
}
