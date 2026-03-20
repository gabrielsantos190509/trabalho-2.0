import java.util.ArrayList;

public class Main {
    // Criamos uma lista dinamica para guardar os itens que vamos cadastrar.
    private static ArrayList<Item> lista = new ArrayList<>();

    public static void main(String[] args) {
        int opcao = -1;

        // O loop mantem o menu rodando ate o usuario escolher a opcao 0.
        while (opcao != 0) {
            System.out.println("\n--- SISTEMA DE CADASTRO ---");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("0. Sair");
            
            // Puxamos a validacao de numeros da outra classe.
            opcao = EntradaDados.lerInteiro("Opcao: ");

            switch (opcao) {
                case 1:
                    // Coleta os dados, cria o objeto e salva na lista.
                    String nome = EntradaDados.lerString("Nome: ");
                    double preco = EntradaDados.lerDouble("Preco: ");
                    lista.add(new Item(nome, preco));
                    System.out.println("Sucesso: Item adicionado.");
                    break;

                case 2:
                    System.out.println("\n--- LISTAGEM ---");
                    // Verifica se a lista esta vazia antes de tentar imprimir.
                    if (lista.isEmpty()) {
                        System.out.println("Nao existem itens cadastrados.");
                    } else {
                        // Percorre a lista e mostra os itens um por um.
                        for (Item i : lista) {
                            System.out.println(i);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }
}