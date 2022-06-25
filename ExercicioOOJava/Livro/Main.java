import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        List <Livro> livros = new ArrayList<>();

        int escolha = 1;

       while (escolha != 6) {

        System.out.println("1 - Cadastrar;");
        System.out.println("2 - Atualizar;");
        System.out.println("3 - Pesquisar por nome;");
        System.out.println("4 - Buscar tudo;");
        System.out.println("5 - Deletar;");
        System.out.println("6 - Sair.");
        System.out.println("O que você quer fazer ? ");
        escolha = Integer.parseInt(scan.next());
        
        switch (escolha) {
            case 1:
                Livro livro = new Livro();
                System.out.println("O ID do novo livro será: " + livros.size() + 1);
                livro.id = livros.size() + 1;
                System.out.println("Qual é o nome do novo livro ? ");
                livro.nome = scan.next();
                System.out.println("Quem é o autor do novo livro ? ");
                livro.autor = scan.next();
                System.out.println("Quantas paginas tem o novo livro ? ");
                livro.quantidadePaginas = scan.nextInt();
                livros.add(livro);
                break;
            case 2:
                System.out.println("Digite o ID do livro que você deseja atualizar: ");
                int index = scan.nextInt() - 1;
                System.out.println("Qual é o novo nome do livro? ");
                livros.get(index).nome = scan.next();
                System.out.println("Qual é o novo autor do livro? ");
                livros.get(index).autor = scan.next();
                System.out.println("Qual é a nova quantidade de pagínas do livro? ");
                livros.get(index).nome = scan.next();
                break;
            case 3:
                System.out.println("Digite o nome do livro que você deseja pesquisar: ");
                String livroPesquisado = scan.next();
                for (Livro l : livros) {
                    if (l.nome.contains(livroPesquisado)) {
                        System.out.println("Encontramos o livro que você quer!");
                        System.out.println("Que é " + l);
                    }
                }
                break;
            case 4:
                System.out.println("Vamos buscar tudo!");
                    for (Livro livro2 : livros) {
                        System.out.println(livro2);
                    }
                break;
            case 5:
                System.out.println("Qual é o ID do livro que você quer deletar ? ");
                livros.remove(scan.nextInt() - 1);
                break;
            default:
                System.out.println("Opção inválida, digite um número valido, por favor!");
                break;
        }
       }

        scan.close();
    }
    
}
