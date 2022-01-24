import java.util.ArrayList;

public class GerenciadorDePessoas {

    private ArrayList<Cliente> clientes;
    private ArrayList<VendedorDeImoveis> vendedores;

    public GerenciadorDePessoas() {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente c : clientes) {
            String cpfCliente = c.getCpf();

            if (cpf.equals(cpfCliente)) {
                return c;
            }
        }

        return null;
    }

    public VendedorDeImoveis buscarVendedorDeImoveis(String cpf) {
        for (VendedorDeImoveis v : vendedores) {
            String cpfVendedor = v.getCpf();

            if (cpf.equals(cpfVendedor)) {
                return v;
            }
        }

        return null;
    }

    public void cadastrarCliente(String nome, String cpf, String dataNascimento, double saldo) {
        Cliente c = new Cliente(nome, cpf, dataNascimento, saldo);

        clientes.add(c);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void cadastrarVendedorDeImoveis(String nome, String cpf, String dataNascimento) {
        VendedorDeImoveis vendedorDeImoveis = new VendedorDeImoveis(nome, cpf, dataNascimento);

        vendedores.add(vendedorDeImoveis);
        System.out.println("Vendedor de imóveis cadastraddo com sucesso!");
    }
}
