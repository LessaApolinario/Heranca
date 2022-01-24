import java.util.Scanner;

public class Main {

    // Usado para cadastro de clientes e vendedores de imóveis
    static GerenciadorDePessoas gerenciadorDePessoas = new GerenciadorDePessoas();

    public static void main(String[] args) {

    }

    public static void abrirDialogoCadastrarCasa(String cpf) {
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
        boolean temJardim = reposta.toUpperCase().equals("SIM");

        // Buscando o vendedor de imóveis para cadastrar a casa
        VendedorDeImoveis vendedorProcurado = gerenciadorDePessoas.buscarVendedorDeImoveis(cpf);
        vendedorProcurado.cadastrarCasa(janelas, portas, quartos, preco, temJardim);
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

        System.out.println("Vendedor de imóveis cadastrado com sucesso!");
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

    public void obterInformacoesCliente() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o cpf do cliente procurado? ");
        String cpf = in.nextLine();

        Cliente clienteEncontrado = gerenciadorDePessoas.buscarCliente(cpf);

        System.out.println(clienteEncontrado.toString());
    }

    public static void obterInformacoesVendedorDeImoveis(String cpf) {
        VendedorDeImoveis vendedorDeImoveis = gerenciadorDePessoas.buscarVendedorDeImoveis(cpf);

        System.out.println(vendedorDeImoveis.toString());
    }

    public static void abrirDialogoVenderCasa(String cpfCliente) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o cpf do vendedor procurado? ");
        String cpfVendedor = in.nextLine();
        VendedorDeImoveis vendedorProcurado = gerenciadorDePessoas.buscarVendedorDeImoveis(cpfVendedor);

        System.out.println("Qual é o preço da casa? ");
        double preco = in.nextDouble();

        System.out.println("A casa tem desejada precisa ter jardim? ");
        String temJardim = in.nextLine();

        boolean resposta = temJardim.equals("SIM");
        Casa casaProcurada = vendedorProcurado.buscarCasa(preco, resposta);

        Cliente clienteProcurado = gerenciadorDePessoas.buscarCliente(cpfCliente);
        vendedorProcurado.venderCasa(casaProcurada, clienteProcurado);
    }

    /// TODO: listarCasas

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
