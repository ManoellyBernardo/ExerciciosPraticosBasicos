public class Exercicio7 {

    /*
     * Faça um programa que recebe dois números e execute uma das operações listadas
     * a seguir, de acordo com a escolha do usuário. Se for digitada uma opção
     * inválida, mostre uma mensagem avisando sobre isso e termine a execução do
     * programa. As opções são:
     * 1. O primeiro número elevado ao segundo número.
     * 2. Raiz quadrada de cada um dos números.
     * 3. Raiz cúbica de cada um dos números.
     */

     public static void main(String[] args) {
        
        int opcao;
        double numBase, numExpoente, resultado, num1, num2;

        System.out.println("As opções são:\n1. O primeiro número elevado ao segundo número." +
        "\n2. Raiz quadrada de cada um dos números.\n3. Raiz cúbica de cada um dos números." + 
        "\nO que você deseja fazer ?");
        opcao = Integer.parseInt(System.console().readLine());

        switch (opcao) {
            case 1:
                System.out.println("Qual é a base ?");
                numBase = Double.parseDouble(System.console().readLine());
                System.out.println("Qual é o expoente ?");
                numExpoente = Double.parseDouble(System.console().readLine());
                resultado = Math.pow(numBase, numExpoente);
                System.out.println("O resultado do primeiro número elevado ao segundo número é " + resultado);
                break;    
            case 2:
                System.out.println("Digite o primeiro número: ");
                num1 = Double.parseDouble(System.console().readLine());
                System.out.println("Digite o primeiro número: ");
                num2 = Double.parseDouble(System.console().readLine());
                System.out.println("As raízes quadradas dos números " + num1 + " e " + num2 + " são: " +
                Math.sqrt(num1) + " e " + Math.sqrt(num2) + ".");
                break;
            case 3:
                System.out.println("Digite o primeiro número: ");
                num1 = Double.parseDouble(System.console().readLine());
                System.out.println("Digite o primeiro número: ");
                num2 = Double.parseDouble(System.console().readLine());
                System.out.println("As raízes cubicas dos números " + num1 + " e " + num2 + " são: " +
                Math.cbrt(num1) + " e " + Math.cbrt(num2) + ".");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

      
     }
}
