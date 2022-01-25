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
}
