import java.util.ArrayList;

public interface IPrateleira {

    public abstract int buscar(IBolo bolo);

    public abstract boolean cheia();

    public abstract boolean vazia();

    public abstract boolean existe(IBolo bolo);

    public abstract boolean inserir(IBolo bolo);

    public abstract IBolo remover(IBolo bolo);

    public abstract IBolo remover(int qtd);

    public abstract IBolo consultar(IBolo bolo);

    public abstract ArrayList<IBolo> listar();

    public abstract ArrayList<IBolo> listar(char x);
}
