import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String produto = "Teclado Mecânico";
        int quantidade = 50;
        int opcao = 0;

        System.out.println("Produto: " + produto);
        System.out.println("Quantidade em estoque: " + quantidade);
        String menu = "Opções:\n" +
                "1. Consultar quantidade em estoque\n" +
                "2. Adicionar produtos ao estoque\n" +
                "3. Retirar produtos do estoque\n" +
                "4. Alterar nome do produto\n" +
                "5. Sair";
        Scanner scanner = new Scanner(System.in);

        while (opcao != 5) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quantidade em estoque: " + quantidade);
                    break;
                case 2:
                    System.out.print("Quantidade a ser inserida: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    quantidade += quantidadeAdicionar;
                    System.out.println(quantidadeAdicionar + " quantidades inseridas no estoque.");
                    break;
                case 3:
                    System.out.print("Quantidade a ser removida: ");
                    int quantidadeRetirar = scanner.nextInt();
                    if (quantidadeRetirar <= quantidade) {
                        quantidade -= quantidadeRetirar;
                        System.out.println(quantidadeRetirar + " unidades removidas do estoque.");
                    } else {
                        System.out.println("Estoque insuficiente.");
                    }
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Novo nome do produto: ");
                    produto = scanner.nextLine();
                    System.out.println("Nome do produto alterado para: " + produto);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    if (quantidade < 10) {
                        System.out.println("ATENÇÃO: Estoque baixo (" + quantidade + " unidades).");
                    }
            }
        }
        scanner.close();
    }
}
