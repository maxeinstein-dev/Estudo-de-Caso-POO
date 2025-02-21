public class Torta extends Bolo {

    final boolean recheio;
    final boolean cobertura;

    public Torta(int codigo, double custo, IFormato formato) {
        super(codigo, custo, formato);
        this.recheio = true; // Por padrão, a torta tem recheio
        this.cobertura = true; // Por padrão, a torta tem cobertura
    }

    public Torta(int codigo, double custo, IFormato formato, boolean recheio, boolean cobertura) {
        super(codigo, custo, formato);
        this.recheio = recheio;
        this.cobertura = cobertura;
    }

    public double preco() {
        double precoBase = super.preco();
        if (recheio)
            precoBase += 12.5;
        if (cobertura)
            precoBase += 20;
        return precoBase;
    }

    @Override
    public String toString() {
        return "Torta [recheio = " + recheio + ", cobertura = " + cobertura + ", " + super.toString();
    }

}
