 public class Exercicio1 {
    
     //Escreva um programa em Java (utilizando switch) que leiam três números inteiros que representam uma data 
     //com dia, mês e ano respectivamente. O programa deve escrever esta data da seguinte forma:
     //dia de nome do mês de ano

    public static void main(String[] args) {

        int dia, mes, ano;
        String nomeMes;

        System.out.println("Digite o dia: ");
        dia = Integer.parseInt(System.console().readLine());
        
        System.out.println("Digite o mês: ");
        mes = Integer.parseInt(System.console().readLine());
        
        System.out.println("Digite o ano: ");
        ano = Integer.parseInt(System.console().readLine());

        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                System.out.println(dia + " de " + nomeMes + " de " + ano);
                break;
            case 2:
                nomeMes = "Fevereiro";
                System.out.println(dia + " de " + nomeMes + " de " + ano);
                break;
            case 3:
                nomeMes = "Março";
                System.out.println(dia + " de " + nomeMes + " de " + ano);
                break;
            case 4:
                nomeMes = "Abril";
                System.out.println(dia + " de " + nomeMes + " de " + ano);
                break;
            case 5:
                nomeMes = "Maio";
                System.out.println(dia + " de " + nomeMes + " de " + ano);
                break;
            case 6:
                nomeMes = "Junho";
                System.out.println(dia + " de " + nomeMes + " de " + ano);
                break;
            case 7:
                nomeMes = "Julho";
                System.out.println(dia + " de " + nomeMes + " de " + ano);
                break;
            case 8:
                nomeMes = "Agosto";
                System.out.println(dia + " de " + nomeMes + " de " + ano);
                break;
            case 9:
                nomeMes = "Setembro";
                System.out.println(dia + " de " + nomeMes + " de " + ano);
                break;
            case 10:
                nomeMes = "Outubro";
                System.out.println(dia + " de " + nomeMes + " de " + ano);
                break;
                case 11:
                nomeMes = "Novembro";
                System.out.println(dia + " de " + nomeMes + " de " + ano);
                break;
            case 12:
                nomeMes = "Dezembro";
                System.out.println(dia + " de " + nomeMes + " de " + ano);
                break;
            default:
                System.out.println("Mês digitada incorretamente.");
                break;
        }
        
    }
}
