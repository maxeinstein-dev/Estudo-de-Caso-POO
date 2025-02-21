abstract class Bolo implements IBolo {

    final int codigo;
    final double custo;
    final IFormato formato;

    // public Bolo(int codigo, double custo) { ?
    // this.codigo = codigo;
    // this.custo = custo;
    // }

    public Bolo(int codigo, double custo, IFormato formato) {
        this.codigo = codigo;
        this.custo = custo;
        this.formato = formato;
    }

    @Override
    public double preco() {
        return custo * formato.area(); // Calcula o preço do bolo
    }

    public int getCodigo() {
        return codigo;
    }

    public double getCusto() {
        return custo;
    }

    public IFormato getFormato() {
        return formato;
    }

    @Override
    public boolean equals(Object obj) {
        boolean resultado = false;

        if (obj != null && obj instanceof Bolo) {
            Bolo bolo = (Bolo) obj;
            // if (this.codigo == bolo.codigo && this.custo == bolo.custo &&
            // this.formato.equals(bolo.formato)) {
            if (this.codigo == bolo.codigo) {
                resultado = true;
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "codigo = " + codigo + ", custo = " + custo + ", formato = " + formato + ", preço = " + preco()
                + "]";
    }

}
