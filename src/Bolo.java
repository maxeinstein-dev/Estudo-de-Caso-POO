abstract class Bolo implements IBolo, IFormato {

    private int codigo;
    private double custo;
    private String formato; // quadrado, retangular ou circular

    public Bolo(int codigo, double custo) {
        setCodigo(codigo);
        setCusto(custo);
    }

    public Bolo(int codigo, double custo, String formato) {
        setCodigo(codigo);
        setCusto(custo);
        setFormato(formato);
    }

    public int getCodigo() {
        return codigo;
    }

    public double getCusto() {
        return custo;
    }

    public String getFormato() {
        return formato;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public boolean equals(Object obj) {
        boolean resultado = false;

        if (obj != null && obj instanceof Bolo) {
            Bolo bolo = (Bolo) obj;
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
