public class Exercicio5 {
    
    //Crie um programa para ler a quantidade de litros de combustível e a distância percorrida por um carro em 
    //várias viagens. O programa deve calcular o consumo médio do carro, que é igual a média de quilômetros por 
    //litro de todas as viagens. O número de viagens realizado deve ser informado pelo usuário.

    public static void main(String[] args) {
        
        int numViagens, cont = 0;
        double litrosCombustivel, distancia, somaQuilometros = 0, mediaQuilomentros;

        System.out.println("Quantas viagens foram realizadas ? ");
        numViagens = Integer.parseInt(System.console().readLine());

        while(cont < numViagens) {
			System.out.println("VIAGEM " + cont+1);
			System.out.println("Quantos litros de combustivel foi consumido? ");
			litrosCombustivel = Double.parseDouble(System.console().readLine());
			System.out.println("Qual foi a distância total percorrida (em km) ? ");
			distancia = Double.parseDouble(System.console().readLine());
			
			somaQuilometros = somaQuilometros + distancia / litrosCombustivel;
			cont = cont + 1;
		}
		
		mediaQuilomentros = somaQuilometros / numViagens;
		System.out.println("Consumo Médio do Carro: " + mediaQuilomentros);
    }
}
