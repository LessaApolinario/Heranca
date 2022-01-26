public class Cliente extends Pessoa {

    private double saldo;

    /**
     * A subclasse herda o estado e os comportamentos da superclasse direta.
     * Isso significa que o construtor da superclasse e os seus métodos
     * também serão acessíveis na subclasse.
     */
    public Cliente(String nome, String cpf, String dataNascimento, double saldo) {
        super(nome, cpf, dataNascimento);

        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public double diminuirSaldo(double saldo, double preco) {
        saldo -= preco;
        return saldo;
    }

    @Override
    public String toString() {
        return "\n--------------------\n" + "Informações do cliente:" + "\n" + "Nome: " + getNome() + "\n" + "cpf: " + getCpf() + "\n" + "Data de nascimento: " + getDataNascimento() + "\n" + "Saldo: " + getSaldo() + "\n--------------------\n";
    }
}
