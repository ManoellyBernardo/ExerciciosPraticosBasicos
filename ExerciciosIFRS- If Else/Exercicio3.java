import java.util.Scanner;

public class Exercicio3 {
    
    //Construa um programa que leia três valores numéricos (representados pelas variáveis A, B e C) e faça o cálculo do
    //delta de uma equação de segundo grau, segundo a fórmula de Báskara. O programa deve mostrar quantas raízes reais a 
    //equação possui (delta < 0 – mostrar uma mensagem dizendo que a equação não possui raízes reais, delta > 0 – mostrar 
    //que possui duas raízes reais, delta = 0 – mostrar que possui uma única raiz real).

    public static void main(String[] args) {
        
        int numA, numB, numC, delta;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite aqui o valor de A: ");
        numA = scan.nextInt();
        
        System.out.println("Digite aqui o valor de B: ");
        numB = scan.nextInt();
    
        System.out.println("Digite aqui o valor de C: ");
        numC = scan.nextInt();
        
        delta = numB * numB - (4 * numA * numC);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta > 0){
            System.out.println("A equação possui duas raízes reais.");
        } else {
            System.out.println("A equação possui uma unica raíz.");
        }

        scan.close();
    }
}
