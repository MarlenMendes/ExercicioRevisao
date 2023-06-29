import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GerenciadorDeCandidatos gerenciador = new  GerenciadorDeCandidatosImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("O que você gostaria de fazer?");
            System.out.println("1. Adicionar candidato");
            System.out.println("2. Exibir candidatos");
            System.out.println("3. Excluir candidato");
            System.out.println("4. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (escolha) {
                case 1:
                    System.out.print("Digite o número de inscrição do candidato: ");
                    String numeroInscricao = scanner.nextLine();
                    System.out.print("Digite a nota do candidato: ");
                    double nota = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    gerenciador.adicionarCandidato(new Candidato(numeroInscricao, nota));
                    break;
                case 2:
                    System.out.println("Candidatos cadastrados:");
                    for (Candidato candidato : gerenciador.listarCandidatos()) {
                        System.out.println(candidato);
                    }
                    break;
                case 3:
                    System.out.print("Digite o número de inscrição do candidato que deseja excluir: ");
                    numeroInscricao = scanner.nextLine();
                    gerenciador.removerCandidatoPorInscricao(numeroInscricao);
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