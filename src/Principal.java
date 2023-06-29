import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutosImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("O que você gostaria de fazer?");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Exibir produtos");
            System.out.println("3. Excluir produto");
            System.out.println("4. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    gerenciador.adicionarProduto(new Produto(nome, preco));
                    break;
                case 2:
                    System.out.println("Produtos cadastrados:");
                    for (Produto produto : gerenciador.listarProdutos()) {
                        System.out.println(produto);
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do produto que deseja excluir: ");
                    nome = scanner.nextLine();
                    gerenciador.removerProdutoPorNome(nome);
                    break;
                case 4:
                    System.out.println("Encerrando programa...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
