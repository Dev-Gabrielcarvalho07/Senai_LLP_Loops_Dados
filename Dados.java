import java.util.Scanner;


public class Dados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       
        System.out.print("Digite a quantidade de dados (Enter para 1 dado): ");
        int quantidadeDados;
        String entrada = scanner.nextLine().trim();
       
        if (entrada.isEmpty()) {
            quantidadeDados = 1;
        } else {
            try {
                quantidadeDados = Integer.parseInt(entrada);
                if (quantidadeDados <= 0) {
                    System.out.println("Erro: A quantidade de dados deve ser maior que zero!");
                    scanner.close();
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido para a quantidade de dados!");
                scanner.close();
                return;
            }
        }
       
       
        System.out.println("\nResultado do sorteio:");
        for (int i = 0; i < quantidadeDados; i++) {
            int valor = (int) (Math.random() * 6) + 1;
            System.out.println("Dado " + (i + 1) + ":");
            desenharDado(valor);
            System.out.println();
        }
       
        System.out.println("Sorteio concluído com sucesso!");
        scanner.close();
    }
   
   
    public static void desenharDado(int valor) {
        String[] linhas = new String[3];
        for (int i = 0; i < 3; i++) {
            linhas[i] = "|       |";
        }
       
        switch (valor) {
            case 1:
                linhas[1] = "|   *   |";
                break;
            case 2:
                linhas[0] = "| *     |";
                linhas[2] = "|     * |";
                break;
            case 3:
                linhas[0] = "| *     |";
                linhas[1] = "|   *   |";
                linhas[2] = "|     * |";
                break;
            case 4:
                linhas[0] = "| *   * |";
                linhas[2] = "| *   * |";
                break;
            case 5:
                linhas[0] = "| *   * |";
                linhas[1] = "|   *   |";
                linhas[2] = "| *   * |";
                break;
            case 6:
                linhas[0] = "| *   * |";
                linhas[1] = "| *   * |";
                linhas[2] = "| *   * |";
                break;
        }
       
        System.out.println("+-------+");
        for (String linha : linhas) {
            System.out.println(linha);
        }
        System.out.println("+-------+");
    }
}
