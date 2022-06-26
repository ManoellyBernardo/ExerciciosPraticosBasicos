
public class Exercicio1 {
    
    //Faça um programa que calcule a soma de dez números quaisquer fornecidos pelo usuário

    public static void main(String[] args) {

        double num, soma = 0;

        for (int i = 0; i < 10; i++) {
            
            System.out.println("Digite um número qualquer: ");
            num = Double.parseDouble(System.console().readLine());

            soma =+ num;
        }

        System.out.println("A soma de todos os números foi: " + soma);

    }
}
