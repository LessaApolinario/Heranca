import java.util.ArrayList;

public class VendedorDeImoveis extends Pessoa {

    public VendedorDeImoveis(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    @Override
    public String toString() {
        return "\n--------------------\n" + "Informações do vendedor de imóveis: " + "\n" + "Nome: " + super.getNome() + "\n" + "cpf: " + super.getCpf() + "\n" + "Data de nascimento: " + super.getDataNascimento() + "\n--------------------\n";
    }
}
