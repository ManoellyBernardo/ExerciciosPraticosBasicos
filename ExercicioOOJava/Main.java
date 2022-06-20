package ExercicioOOJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();

        int escolha = 0;

        while (escolha != 6) {
            System.out.println("Escolha o que você quer fazer: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Pesquisar");
            System.out.println("4 - Exibir tudo");
            System.out.println("5 - Excluir");
            System.out.println("6 - Sair");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    Carro carro = new Carro();
                    System.out.println("Qual é a cor do carro ? ");
                    carro.cor = scan.next();
                    System.out.println("Qual é a marca do carro ? ");
                    carro.marca = scan.next();
                    System.out.println("Qual é a nome do carro ? ");
                    carro.nome = scan.next();
                    System.out.println("Qual é a placa do carro ? ");
                    carro.placa = scan.next();
                    carros.add(carro);
                    break;
                case 2:
                    System.out.println("Digite o ID do carro que você deseja atualizar: ");
                    int index = scan.nextInt();
                    System.out.println("Qual é nova cor do carro? ");
                    carros.get(index).cor = scan.next();
                    System.out.println("Qual é nova marca do carro? ");
                    carros.get(index).marca = scan.next();
                    System.out.println("Qual é nova nome do carro? ");
                    carros.get(index).nome = scan.next();
                    System.out.println("Qual é nova placa do carro? ");
                    carros.get(index).placa = scan.next();
                    break;
                case 3:
                    System.out.println("Digite o ID do carro que você deseja pesquisar: ");
                    System.out.println(carros.get(scan.nextInt()));
                    break;
                case 4:
                    for (Carro c : carros) {
                        System.out.println(c);
                    }
                    break;
                case 5:
                    System.out.println("Digite o ID do carro que você deseja deletar: ");
                    carros.remove(scan.nextInt());
                    break;
                default:
                    break;
            }
        }

        scan.close();
    }
}
