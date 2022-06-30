import java.util.Scanner;

public class Exercicio3 {

    // Escreva um programa em Java que leia um string contendo um número em binário
    // e o mostre em decimal na tela.

    public static void main(String[] args) {
        
        String numBinario;

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva aqui um número binário: ");
        numBinario = scan.nextLine();

        System.out.println("O decimal de " + numBinario + " é " + Integer.parseInt(numBinario, 16));

        scan.close();
    }
}
