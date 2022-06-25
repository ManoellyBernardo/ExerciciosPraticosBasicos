import java.util.Scanner;

public class Exercicio8 {
    
    //Uma empresa decide dar um aumento de 30% aos funcionários cujo salário é inferior a 5000. Escreva um programa que 
    //possa ser utilizado para efetuar o cálculo do salário reajustado de um funcionário, a partir do valor do salário 
    //informado pelo usuário.

    public static void main(String[] args) {
            
        double salario;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o valor do salário do funcionário ? ");
        salario = scan.nextDouble();

        if (salario < 5000) {
            salario = salario + (salario * 30/100);
        }

        System.out.println("O valor do salário atualizado é de " + salario);

        scan.close();
    }
}
