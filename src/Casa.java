public class Casa {

    private int janelas;
    private int portas;
    private int quartos;
    private double preco;
    private boolean temJardim;

    public Casa(int janelas, int portas, int quartos, double preco, boolean temJardim) {
        if (janelas >= 0) {
            this.janelas = janelas;
        }

        if (portas > 0) {
            this.portas = portas;
        }

        if (quartos > 0) {
            this.quartos = quartos;
        }

        if (preco > 0) {
            this.preco = preco;
        }

        this.temJardim = temJardim;
    }

    public int getJanelas() {
        return janelas;
    }

    public void setJanelas(int janelas) {
        if (janelas >= 0) {
            this.janelas = janelas;
        }
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        if (portas > 0) {
            this.portas = portas;
        }
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        if (quartos > 0) {
            this.quartos = quartos;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public boolean getTemJardim() {
        return temJardim;
    }

    public void setTemJardim(boolean temJardim) {
        this.temJardim = temJardim;
    }

    @Override
    public String toString() {
        if (this.temJardim) {
            return "\n--------------------\n" + "Informações da casa:\n" + "Janelas: " + this.janelas + "\n" + "Portas: " + this.portas + "\n" + "Quartos: " + this.quartos + "\n" + "Preço: " + this.preco + "\n" + "Possui jardim!" + "\n--------------------\n";
        }

        return "\n--------------------\n" + "Informações da casa:\n" + "Janelas: " + this.janelas + "\n" + "Portas: " + this.portas + "\n" + "Quartos: " + this.quartos + "\n" + "Preço: " + this.preco + "\n" + "Não possui jardim!" + "\n--------------------\n";
    }
}
