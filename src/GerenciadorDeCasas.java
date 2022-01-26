import java.util.ArrayList;

public class GerenciadorDeCasas {

    private ArrayList<Casa> casas;

    public GerenciadorDeCasas() {
        this.casas = new ArrayList<>();
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public void cadastrarCasa(int janelas, int portas, int quartos, double preco, boolean temJardim) {
        Casa casa = new Casa(janelas, portas, quartos, preco, temJardim);

        casas.add(casa);
        System.out.println("Casa cadastrada com sucesso!");
    }

    public Casa buscarCasa(double preco, boolean temJardim, ArrayList<Casa> casas) {
        for (Casa c : casas) {
            boolean temJardimCasa = c.getTemJardim();

            if (preco == c.getPreco() && temJardim == temJardimCasa) {
                return c;
            }
        }

        return null;
    }

    public String venderCasa(Casa casa, Cliente cliente, double precoCasa, boolean  temJardim, VendedorDeImoveis vendedorDeImoveis) {
        double saldoCliente = cliente.getSaldo();

        if (saldoCliente >= precoCasa) {
            System.out.println("A casa " + casa.toString() + " foi vendida com sucesso");
            System.out.println("Vendedor: " + vendedorDeImoveis.getNome());
            System.out.println("Comprador: " + cliente.getNome());

            // Esse método é de cliente porque ele, após a compra, subtrai uma quantia do seu saldo!
            double novoSaldo = cliente.diminuirSaldo(saldoCliente, precoCasa);
            cliente.setSaldo(novoSaldo);

            casas.remove(casa);
            return "Saldo atual: " + cliente.getSaldo();
        }

        return "Saldo insuficiente!";
    }
}
