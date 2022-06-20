package ExercicioOOJava;

import java.util.List;

public class Carro {
    
    public String cor;
    public String placa;
    public String marca;
    public String nome;

    public void acelerar() {
        System.out.println("Acelerando..");
    }

    public void frear(){
        System.out.println("Freando..");
    }

    @Override
    public String toString() {
        String resultado = "Nome: " + this.nome + "| Cor: " + this.cor + "| Marca: " + this.marca + 
        "| Placa: " + this.placa;
        return resultado;
    }
}
