import java.util.ArrayList;

public class GerenciadorDePessoas {

    private ArrayList<Cliente> clientes;
    private ArrayList<VendedorDeImoveis> vendedores;

    public GerenciadorDePessoas() {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
    }

    public Cliente cadastrarCliente(String nome, String cpf, String dataNascimento, double saldo) {
        Cliente c = new Cliente(nome, cpf, dataNascimento, saldo);

        clientes.add(c);

        return c;
    }

    public VendedorDeImoveis cadastrarVendedorDeImoveis(String nome, String cpf, String dataNascimento) {
        VendedorDeImoveis vendedorDeImoveis = new VendedorDeImoveis(nome, cpf, dataNascimento);

        vendedores.add(vendedorDeImoveis);

        return vendedorDeImoveis;
    }
}
