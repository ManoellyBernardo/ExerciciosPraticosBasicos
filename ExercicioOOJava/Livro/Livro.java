public class Livro {
    
    public int id;
    public String nome;
    public String autor;
    public int quantidadePaginas;

    @Override
    public String toString() {
        String resultado = "ID: " + this.id + "| Nome: " + this.nome + "| Autor: " + this.autor + 
        "| Quantidade de páginas " + this.quantidadePaginas;
        return resultado;
    }
}
