import java.util.Scanner;

public class main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        iphone iphone = new iphone();
        int opcaoPrincipal;

        do {
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Navegador Internet");
            System.out.println("3 - Aparelho Telefônico");
            opcaoPrincipal = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcaoPrincipal) {
                case 1 -> menuMusica(iphone);
                case 2 -> menuNavegador(iphone);
                case 3 -> menuTelefone(iphone);
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcaoPrincipal != 0);
    }

    private static void menuMusica(iphone iphone) {
        int opcao;
        do {
            System.out.println("1 - Tocar");
            System.out.println("2 - Pausar");
            System.out.println("3 - Selecionar Música");
            System.out.println("0 - Voltar");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> iphone.tocar();
                case 2 -> iphone.pausar();
                case 3 -> iphone.selecionarMusica(); 
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void menuNavegador(iphone iphone) {
        int opcao;
        do {
            System.out.println("1 - Exibir Página");
            System.out.println("2 - Adicionar Nova Aba");
            System.out.println("3 - Atualizar Página");
            System.out.println("0 - Voltar");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> iphone.exibirPagina(null);
                case 2 -> iphone.adicionarNovaAba();
                case 3 -> iphone.atualizarPagina();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void menuTelefone(iphone iphone) {
        int opcao;
        do {
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Iniciar Correio de Voz");
            System.out.println("0 - Voltar");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> iphone.atender();
                case 2 -> iphone.atender();
                case 3 -> iphone.iniciarCorreioVoz();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}