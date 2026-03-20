import java.util.Scanner;
import java.util.InputMismatchException;

public class EntradaDados {
    // Criamos o scanner uma vez para ser usado por todo o sistema.
    private static Scanner scanner = new Scanner(System.in);

    // Esse bloco impede que o programa feche se o usuario digitar letras em vez de numeros.
    public static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                int valor = scanner.nextInt();
                scanner.nextLine(); // Limpa a memoria do teclado para a proxima pergunta.
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas numeros inteiros.");
                scanner.nextLine(); // Limpa o erro do sistema.
            }
        }
    }

    // Faz a mesma validacao que o anterior, mas aceita numeros com virgula.
    public static double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double valor = scanner.nextDouble();
                scanner.nextLine(); 
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Formato de numero incorreto.");
                scanner.nextLine();
            }
        }
    }

    // Metodo simples para capturar nomes e textos.
    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
}