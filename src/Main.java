import java.util.Scanner;

public class Main {

    static GerenciadorDePessoas gerenciadorDePessoas = new GerenciadorDePessoas();

    public static void main(String[] args) {

    }

    public static void abrirDialogoCadastrarCliente() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o nome do cliente? ");
        String nome = in.nextLine();

        System.out.println("Qual é o cpf do cliente? ");
        String cpf = in.nextLine();

        System.out.println("Qual é a data de nascimento do cliente? ");
        String dataNascimento = in.nextLine();

        System.out.println("Qual é o saldo do cliente? ");
        double saldo = in.nextDouble();

        gerenciadorDePessoas.cadastrarCliente(nome, cpf, dataNascimento, saldo);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void menu() {
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Cadastrar vendedor de imóveis");
        System.out.println("3. Obter informações do cliente");
        System.out.println("4. Obter informações do vendedor de imóveis");
        System.out.println("5. Vender casa");
        System.out.println("6. Listar casas disponíveis");
        System.out.println("0. Sair");
    }

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
