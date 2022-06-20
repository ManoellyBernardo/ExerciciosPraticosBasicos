import java.util.Scanner;

public class Exercicio5 {
    
    //Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, 
    //sabendo-se que o funcionário tem gratificação de 5% sobre o salário base (que será acrescentado ao 
    //salário) e paga imposto de 7% sobre este salário (o que será descontado do salário).

    public static void main(String[] args) {
        
        double salarioBase, salarioReceber;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o salário base do funcionário ? ");
        salarioBase = scan.nextDouble();

        salarioReceber = salarioBase +  (salarioBase * 5/100) - (salarioBase * 7/100);

        System.out.println("O sálario a receber é de " + salarioReceber);

        scan.close();

    }
}
