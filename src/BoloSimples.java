public class BoloSimples extends Bolo {

    final boolean semLactose;

    public BoloSimples(int codigo, double custo, IFormato formato) {
        super(codigo, custo, formato);
    }

    public BoloSimples(int codigo, double custo, IFormato formato, boolean semLactose) {
        super(codigo, custo, formato);
        this.semLactose = semLactose;
    }

    public boolean isSemLactose() {
        return semLactose;
    }

    public double preco() {
        return 0;
    }

    @Override
    public String toString() {
        return "Bolo Simples [sem lactose = " + semLactose + ", " + super.toString();
    }

}
