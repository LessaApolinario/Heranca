import java.util.ArrayList;

public class VendedorDeImoveis extends Pessoa {

    private ArrayList<Casa> casas = new ArrayList<>();

    public VendedorDeImoveis(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public void venderCasa(Casa casa, Cliente cliente) {
        double saldoCliente = cliente.getSaldo();
        double precoCasa = casa.getPreco();

        if (saldoCliente >= precoCasa) {
            System.out.println("A casa " + casa.toString() + " foi vendida com sucesso");
            System.out.println("Vendedor: " + getNome());
            System.out.println("Comprador: " + cliente.getNome());
            casas.remove(casa);

            saldoCliente -= precoCasa;
            System.out.println("Saldo atual: " + saldoCliente);
        }
    }

    public Casa buscarCasa(double preco, boolean temJardim) {
        for (Casa c : casas) {
            boolean temJardimCasa = c.getTemJardim();

            if (preco == c.getPreco() && temJardim == temJardimCasa) {
                return c;
            }
        }

        return null;
    }

    public void cadastrarCasa(int janelas, int portas, int quartos, double preco, boolean temJardim) {
        Casa casa = new Casa(janelas, portas, quartos, preco, temJardim);

        casas.add(casa);
        System.out.println("Casa cadastrada com sucesso!");
    }

    public void listarCasas() {
        for (Casa c : casas) {
            System.out.println(c.toString());
        }
    }

    @Override
    public String toString() {
        return "\n--------------------\n" + "Informações do vendedor de imóveis: " + "\n" + "Nome: " + super.getNome() + "\n" + "cpf: " + super.getCpf() + "\n" + "Data de nascimento: " + super.getDataNascimento() + "\n--------------------\n";
    }
}
