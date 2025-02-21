public class Torta extends Bolo {

    final boolean recheio;
    final boolean cobertura;

    public Torta(int codigo, double custo, IFormato formato) {
        super(codigo, custo, formato);
    }

    public Torta(int codigo, double custo, IFormato formato, boolean recheio, boolean cobertura) {
        super(codigo, custo, formato);
        this.recheio = recheio;
        this.cobertura = cobertura;
    }

    public double preco() {
        return 0;
    }

    @Override
    public String toString() {
        return "Torta [recheio = " + recheio + ", cobertura = " + cobertura + ", " + super.toString();
    }

}
