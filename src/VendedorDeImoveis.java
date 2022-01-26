import java.util.ArrayList;

public class VendedorDeImoveis extends Pessoa {

    public VendedorDeImoveis(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public void venderCasa(Casa casa, Cliente cliente, ArrayList<Casa> casas) {
        double saldoCliente = cliente.getSaldo();
        double precoCasa = casa.getPreco();

        if (saldoCliente >= precoCasa) {
            System.out.println("A casa " + casa.toString() + " foi vendida com sucesso");
            System.out.println("Vendedor: " + getNome());
            System.out.println("Comprador: " + cliente.getNome());
            casas.remove(casa);

            // Esse método é de cliente porque ele, após a compra, subtrai uma quantia do seu saldo!
            double novoSaldo = cliente.diminuirSaldo(saldoCliente, precoCasa);
            cliente.setSaldo(novoSaldo);

            System.out.println("Saldo atual: " + cliente.getSaldo());
        }
    }

    @Override
    public String toString() {
        return "\n--------------------\n" + "Informações do vendedor de imóveis: " + "\n" + "Nome: " + super.getNome() + "\n" + "cpf: " + super.getCpf() + "\n" + "Data de nascimento: " + super.getDataNascimento() + "\n--------------------\n";
    }
}
