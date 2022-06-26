
public class Exercicio4 {

    // Faça um programa que receba várias idades, calcule e mostre a média das
    // idades digitadas. Finalize digitando idade
    // igual a zero.

    public static void main(String[] args) {

        int idade, somaIdades = 0, quantidadeIdades = 0;
        double mediaIdades;
        
        System.out.println("Digite aqui a idade: ");
        idade = Integer.parseInt(System.console().readLine());
        
        while (idade != 0) {
 
            somaIdades += idade;
            
            quantidadeIdades++;
            
            mediaIdades = somaIdades / quantidadeIdades;
            
            System.out.println("A média das idades digitadas é: " + mediaIdades);
           
            System.out.println("Digite aqui a idade: ");
            idade = Integer.parseInt(System.console().readLine());
        }
    }
}
