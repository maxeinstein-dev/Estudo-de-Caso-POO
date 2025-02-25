import java.util.ArrayList;

public class VetorPrateleira implements IPrateleira {

    final ArrayList<IBolo> prateleira;
    public int qtdBolo;

    public VetorPrateleira(int qtdBolo) {
        this.prateleira = new ArrayList<>();
        this.qtdBolo = qtdBolo;
    }

    @Override
    public int buscar(IBolo bolo) {
        return prateleira.indexOf(bolo);
    }

    @Override
    public boolean cheia() {
        return prateleira.size() >= qtdBolo;
    }

    @Override
    public boolean vazia() {
        return prateleira.isEmpty();
    }

    @Override
    public boolean existe(IBolo bolo) {
        return prateleira.contains(bolo);
    }

    @Override
    public boolean inserir(IBolo bolo) {
        if (prateleira.contains(bolo)) {
            System.out.println("Bolo ou torta já cadastrado");
            return false;
        }
        if (cheia()) {
            System.out.println("Prateleira cheia");
            return false;
        }
        prateleira.add(bolo);
        return true;
    }

    @Override
    public IBolo remover(IBolo bolo) {
        return prateleira.remove(bolo) ? bolo : null;
    }

    @Override
    public IBolo remover(int codigo) {
        for (IBolo bolo : prateleira) {
            if (((Bolo) bolo).getCodigo() == codigo) {
                prateleira.remove(bolo);
                return bolo;
            }
        }
        return null;
    }

    @Override
    public IBolo consultar(IBolo bolo) {
        int index = buscar(bolo);
        return index >= 0 ? prateleira.get(index) : null;
    }

    @Override
    public ArrayList<IBolo> listar() {
        return new ArrayList<>(prateleira);
    }

    @Override
    public ArrayList<IBolo> listar(char tipoDoBolo) {
        ArrayList<IBolo> resultado = new ArrayList<>();
        for (IBolo bolo : prateleira) {
            if ((tipoDoBolo == 'S' && bolo instanceof BoloSimples) || (tipoDoBolo == 'T' && bolo instanceof Torta)) {
                resultado.add(bolo);
            }
        }
        return resultado;
    }

}
