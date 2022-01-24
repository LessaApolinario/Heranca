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
            casas.remove(casa);

            saldoCliente -= precoCasa;
            System.out.println("Saldo atual: " + cliente.getSaldo());

            System.out.println("A casa " + casa.toString() + " foi vendida com sucesso");
        }
    }
}
