import java.util.ArrayList;

public class VendedorDeImoveis extends Pessoa {

    private ArrayList<Casa> casas;

    public VendedorDeImoveis(String nome, String cpf, String dataNascimento, ArrayList<Casa> casas) {
        super(nome, cpf, dataNascimento);
        this.casas = new ArrayList<>();
    }

    // Retorna as casas cadastradas para venda
    public ArrayList<Casa> getCasas() {
        return casas;
    }
}
