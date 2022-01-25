import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Usado para cadastro de clientes e vendedores de imóveis
    static GerenciadorDePessoas gerenciadorDePessoas = new GerenciadorDePessoas();
    // Usado para cadastro de casas
    static GerenciadorDeCasas gerenciadorDeCasas = new GerenciadorDeCasas();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int op;

        do {
            menu();
            System.out.println("Escolha uma opção: ");
            op = in.nextInt();
            limparBuffer(in);

            switch (op) {
                case 1:
                    abrirDialogoCadastrarCliente();
                    break;
                case 2:
                    abrirDialogoCadastrarVendedorDeImoveis();
                    break;
                case 3:
                    abrirDialogoCadastrarCasa();
                    break;
                case 4:
                    obterInformacoesCliente();
                    break;
                case 5:
                    obterInformacoesVendedorDeImoveis();
                    break;
                case 6:
                    abrirDialogoVenderCasa();
                    break;
                case 7:
                    listarCasas(gerenciadorDeCasas.getCasas());
                    break;
            }

        } while (op != 0);
    }

    public static void abrirDialogoCadastrarCasa() {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantas janelas a casa possui? ");
        int janelas = in.nextInt();

        System.out.println("Quantas portas a casa possui? ");
        int portas = in.nextInt();

        System.out.println("Quantos quartos a casa possui? ");
        int quartos = in.nextInt();

        System.out.println("Qual é o preço da casa? ");
        double preco = in.nextDouble();

        System.out.println("A casa possui jardim? ");
        String reposta = in.nextLine();

        // Verifica se a casa tem jardim
        boolean temJardim = reposta.equalsIgnoreCase("SIM");

        gerenciadorDeCasas.cadastrarCasa(janelas, portas, quartos, preco, temJardim);
    }

    public static void abrirDialogoCadastrarVendedorDeImoveis() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o nome do vendedor? ");
        String nome = in.nextLine();

        System.out.println("Qual é o cpf do vendedor? ");
        String cpf = in.nextLine();

        System.out.println("Qual é a data de nascimento do vendedor? ");
        String dataNascimento = in.nextLine();

        gerenciadorDePessoas.cadastrarVendedorDeImoveis(nome, cpf, dataNascimento);
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
    }

    public static void obterInformacoesCliente() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o cpf do cliente procurado? ");
        String cpf = in.nextLine();

        Cliente clienteEncontrado = gerenciadorDePessoas.buscarCliente(cpf);

        System.out.println(clienteEncontrado.toString());
    }

    public static void obterInformacoesVendedorDeImoveis() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o cpf do vendedor procurado? ");
        String cpf = in.nextLine();

        VendedorDeImoveis vendedorDeImoveis = gerenciadorDePessoas.buscarVendedorDeImoveis(cpf);

        System.out.println(vendedorDeImoveis.toString());
    }

    public static void abrirDialogoVenderCasa() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o preço da casa? ");
        double preco = in.nextDouble();

        System.out.println("A casa tem desejada precisa ter jardim? ");
        String temJardim = in.nextLine();

        boolean resposta = temJardim.equals("SIM");
        Casa casaProcurada = gerenciadorDeCasas.buscarCasa(preco, resposta, gerenciadorDeCasas.getCasas());

        System.out.println("Qual é o cpf do cliente procurado? ");
        String cpfCliente = in.nextLine();

        Cliente clienteProcurado = gerenciadorDePessoas.buscarCliente(cpfCliente);
        /**
         * O gerenciador de casas informa quais as casas disponíveis,
         * já o vendedor de imóveis apenas as vende!
        */
        System.out.println("Qual é o cpf do vendedor procurado? ");
        String cpfVendedor = in.nextLine();

        VendedorDeImoveis vendedorProcurado = gerenciadorDePessoas.buscarVendedorDeImoveis(cpfVendedor);
        vendedorProcurado.venderCasa(casaProcurada, clienteProcurado, gerenciadorDeCasas.getCasas());
    }

    public static void listarCasas(ArrayList<Casa> casas) {
        System.out.println("Lista de casas disponíveis: ");

        for (Casa c : casas) {
            System.out.println(c.toString());
        }
    }

    public static void menu() {
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Cadastrar vendedor de imóveis");
        System.out.println("3. Cadastrar casa");
        System.out.println("4. Obter informações do cliente");
        System.out.println("5. Obter informações do vendedor de imóveis");
        System.out.println("6. Vender casa");
        System.out.println("7. Listar casas disponíveis");
        System.out.println("0. Sair");
    }

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
