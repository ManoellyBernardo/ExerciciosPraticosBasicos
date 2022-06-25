import java.util.Scanner;

public class Exercicio2 {
    
    //Faça um programa que leia um valor numérico inteiro. O programa deve apresentar a mensagem “O valor está na faixa 
    //permitida”, caso o valor informado esteja entre 1 e 9. Se o valor estiver fora da faixa, o programa deve apresentar 
    //a mensagem “O valor está fora da faixa permitida”.

    public static void main(String[] args) {
        
        int num1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        num1 = scan.nextInt();

        if (num1 >= 1 && num1 <= 9) {
            System.out.println("O valor está na faixa permitida.");
        } else {
            System.out.println("O valor está fora da faixa permitida.");
        }

        scan.close();

    }
}
