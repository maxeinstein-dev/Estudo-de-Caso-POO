import java.util.ArrayList;

public class VetorPrateleira implements IPrateleira {

    final ArrayList<IBolo> prateleira;
    public int qtdBolo;

    public VetorPrateleira(int qtdBolo) {
        this.prateleira = new ArrayList<>();
        this.qtdBolo = qtdBolo;
    }

    // public VetorPrateleira() {} ?

    @Override
    public int buscar(IBolo bolo) {
        return 0;
    }

    @Override
    public boolean cheia() {
        return false;
    }

    @Override
    public boolean vazia() {
        return false;
    }

    @Override
    public boolean existe(IBolo bolo) {
        return false;
    }

    @Override
    public boolean inserir(IBolo bolo) {
        return false;
    }

    @Override
    public IBolo remover(IBolo bolo) {
        return null;
    }

    @Override
    public IBolo remover(int qtd) {
        return null;
    }

    @Override
    public IBolo consultar(IBolo bolo) {
        return null;
    }

    @Override
    public ArrayList<IBolo> listar() {
        return null;
    }

    @Override
    public ArrayList<IBolo> listar(char x) {
        return null;
    }

}
