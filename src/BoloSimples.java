public class BoloSimples extends Bolo {

    private boolean semLactose;

    public BoloSimples(int codigo, double custo, String formato) {
        super(codigo, custo, formato);
        setSemLactose(false); // Por padrão, o bolo simples é com lactose
    }

    public BoloSimples(int codigo, double custo, String formato, boolean semLactose) {
        super(codigo, custo, formato);
        setSemLactose(semLactose);
    }

    public boolean isSemLactose() {
        return semLactose;
    }

    public void setSemLactose(boolean semLactose) {
        this.semLactose = semLactose;
    }

    public double preco() {
        double precoBase = super.getCusto();

        switch (super.getFormato()) {
            case "retangular":
                precoBase *= 1.2;
                break;
            case "circular":
                precoBase *= 1.5;
                break;
            case "quadrado":
                break;
            default:
                break;
        }
        return semLactose ? precoBase + 35 : precoBase; // Calcula o preço do bolo pelo formato
    }

    @Override
    public String toString() {
        return "Bolo Simples [sem lactose = " + semLactose + ", " + super.toString();
    }

    @Override
    public double area() {
        return 0;
    }

}
