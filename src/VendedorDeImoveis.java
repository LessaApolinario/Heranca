import java.util.ArrayList;

public class VendedorDeImoveis extends Pessoa {

    private ArrayList<Casa> casas;

    public VendedorDeImoveis(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
        this.casas = new ArrayList<>();
    }

    public void venderCasa(Casa casa, Cliente cliente) {
        double saldoCliente = cliente.getSaldo();
        double precoCasa = casa.getPreco();

        if (saldoCliente >= precoCasa) {
            System.out.println("A casa " + casa.toString() + " foi vendida com sucesso");
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

    @Override
    public String getCpf() {
        return "\n--------------------\n" + "Informações do vendedor de imóveis: " + "\n" + "Nome: " + super.getNome() + "\n" + "cpf: " + super.getCpf() + "\n" + "Data de nascimento: " + super.getDataNascimento() + "\n--------------------\n";
    }
}
