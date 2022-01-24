import java.util.ArrayList;

public class GerenciadorDePessoas {

    private ArrayList<Cliente> clientes;
    private ArrayList<VendedorDeImoveis> vendedores;

    public GerenciadorDePessoas(ArrayList<Cliente> clientes, ArrayList<VendedorDeImoveis> vendedores) {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
    }

    public Cliente cadastrarCliente(String nome, String cpf, String dataNascimento, double saldo) {
        Cliente c = new Cliente(nome, cpf, dataNascimento, saldo);

        return c;
    }

    public VendedorDeImoveis cadastrarVendedorDeImoveis(String nome, String cpf, String dataNascimento) {
        VendedorDeImoveis vendedorDeImoveis = new VendedorDeImoveis(nome, cpf, dataNascimento);

        return vendedorDeImoveis;
    }
}
