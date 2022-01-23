public class Casa {

    private int janelas;
    private int portas;
    private int quartos;
    private boolean temJardim;

    public Casa(int janelas, int portas, int quartos, boolean temJardim) {
        if (janelas >= 0) {
            this.janelas = janelas;
        }

        if (portas > 0) {
            this.portas = portas;
        }

        if (quartos > 0) {
            this.quartos = quartos;
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

    public boolean getTemJardim() {
        return temJardim;
    }

    public void setTemJardim(boolean temJardim) {
        this.temJardim = temJardim;
    }

    @Override
    public String toString() {
        if (this.temJardim) {
            return "\n--------------------\n" + "Informações da casa:\n" + "Janelas: " + this.janelas + "\n" + "Portas: " + this.portas + "\n" + "Quartos: " + this.quartos + "\n" + "Possui jardim!";
        }

        return "\n--------------------\n" + "Informações da casa:\n" + "Janelas: " + this.janelas + "\n" + "Portas: " + this.portas + "\n" + "Quartos: " + this.quartos + "\n" + "Não possui jardim!";
    }
}
