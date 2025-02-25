public class Torta extends Bolo {

    private boolean recheio;
    private boolean cobertura;

    public Torta(int codigo, double custo, String formato) {
        super(codigo, custo, formato);
        setRecheio(true); // Por padrão, a torta tem recheio
        setCobertura(true); // Por padrão, a torta tem cobertura
    }

    public Torta(int codigo, double custo, String formato, boolean recheio, boolean cobertura) {
        super(codigo, custo, formato);
        setRecheio(recheio);
        setCobertura(cobertura);
    }

    public void setRecheio(boolean recheio) {
        this.recheio = recheio;
    }

    public void setCobertura(boolean cobertura) {
        this.cobertura = cobertura;
    }

    public boolean isRecheio() {
        return recheio;
    }

    public boolean isCobertura() {
        return cobertura;
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

    @Override
    public double area() {
        return 0;
    }

}
