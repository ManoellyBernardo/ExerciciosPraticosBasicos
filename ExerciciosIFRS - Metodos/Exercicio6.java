import java.util.Random;

public class Exercicio6 {
 
    //Escreva um programa em Java que simule o lançamento de um dado, ou seja, sorteie um número entre 1 e 6.

    public static void main(String[] args) {
        
        int numSorteado;

        numSorteado = new Random().nextInt(1,6);

        System.out.println("O número sorteado é " + numSorteado + ".");

    }
}
