public class Item {
    // Definimos os atributos como privados para proteger a informacao.
    private String nome;
    private double preco;

    // O construtor garante que o objeto receba os dados assim que for criado.
    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Metodos para conseguir ler o nome e o preco em outras partes do codigo.
    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    // Esse metodo organiza como o item vai aparecer escrito na tela.
    @Override
    public String toString() {
        return "Item: " + nome + " | Valor: R$ " + String.format("%.2f", preco);
    }
}