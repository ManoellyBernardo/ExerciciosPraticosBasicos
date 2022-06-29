
public class Exercicio9 {

    // A série de Fibonacci é formada pela seguinte sequência: 1, 1, 2, 3, 5, 8, 13,
    // 21, 34, 55, ... etc, onde o próximo número é igual a soma dos dois
    // anteriores. Escreva um programa que gere os dez primeiros números da série de
    // Fibonacci, utilizando a estrutura do...while.

    public static void main(String[] args) {

        int proximoNumero, ultimoNumero = 1, penultimoNumero = 0, cont = 0;
        
        System.out.println(ultimoNumero);
        
        do {    

            proximoNumero = ultimoNumero + penultimoNumero;

            System.out.println(proximoNumero);

            ultimoNumero = penultimoNumero;
            
            penultimoNumero = proximoNumero;

            cont++;

        } while (cont < 10);

    }
}
