public class Person {

    private String nome;
    private String cpf;
    private String dataNascimento;

    public Person(String nome, String cpf, String dataNascimento) {
        if (!nome.equals("")) {
            this.nome = nome;
        }

        if (!cpf.equals("")) {
            this.cpf = cpf;
        }

        if (!dataNascimento.equals("")) {
            this.dataNascimento = dataNascimento;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.equals("")) {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (!cpf.equals("")) {
            this.cpf = cpf;
        }
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if (!dataNascimento.equals("")) {
            this.dataNascimento = dataNascimento;
        }
    }
}
