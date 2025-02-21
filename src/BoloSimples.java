public class BoloSimples extends Bolo {

    final boolean semLactose;

    public BoloSimples(int codigo, double custo, IFormato formato) {
        super(codigo, custo, formato);
        this.semLactose = false; // Por padrão, o bolo simples é com lactose
    }

    public BoloSimples(int codigo, double custo, IFormato formato, boolean semLactose) {
        super(codigo, custo, formato);
        this.semLactose = semLactose;
    }

    public boolean isSemLactose() {
        return semLactose;
    }

    public double preco() {
        double precoBase = super.preco();
        return semLactose ? precoBase + 35 : precoBase;
    }

    @Override
    public String toString() {
        return "Bolo Simples [sem lactose = " + semLactose + ", " + super.toString();
    }

}
