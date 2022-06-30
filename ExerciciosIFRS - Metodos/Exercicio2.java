public class Exercicio2 {

    // Escreva um programa em Java que mostre os números os números de 0 a 100 e
    // seus correspondentes em binário.

    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            
            String j = Integer.toString(i);

            System.out.println("O correspondente binário de " + i + " é " + Integer.parseInt(j,2));

        }
    }
}
