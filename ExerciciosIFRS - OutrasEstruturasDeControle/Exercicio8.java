public class Exercicio8 {

    // Faça um programa, utilizando a estrutura do..while que repita a leitura de uma
    // senha até que o usuário digite o número 1234. Após isso, mostrar a mensagem
    // “Senha correta, acesso liberado.”

    public static void main(String[] args) {
     
        int senhaCorreta = 1234, senha;

        do {

            System.out.println("Digite a senha: ");
            senha = Integer.parseInt(System.console().readLine());

        } while (senha != senhaCorreta);

        System.out.println("Senha correta, acesso liberado.");

    }
}
