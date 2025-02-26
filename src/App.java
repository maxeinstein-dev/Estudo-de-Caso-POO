public class App {

    public static void main(String[] args) {
        VetorPrateleira prateleira = new VetorPrateleira(5);

        // Criando alguns bolos para cadastro
        BoloSimples bolo1 = new BoloSimples(101, 50.0, "quadrado");
        BoloSimples bolo2 = new BoloSimples(102, 40.0, "retangular");
        BoloSimples bolo3 = new BoloSimples(103, 60.0, "circular", true);
        // Tentando inserir um bolo com código duplicado
        BoloSimples bolo4 = new BoloSimples(103, 60.0, "circular", true);
        Torta torta1 = new Torta(104, 80.0, "retangular");
        Torta torta2 = new Torta(105, 75.0, "quadrado", false, true);
        // Tentando inserir uma torta com código duplicado
        Torta torta3 = new Torta(105, 75.0, "quadrado", false, true);
        // Tentando inserir uma torta com a prateleira cheia
        Torta torta4 = new Torta(106, 100.0, "circular", false, false);

        // Testando o cadastro
        System.out.println("\nInserindo bolos na prateleira...");
        prateleira.inserir(bolo1);
        prateleira.inserir(bolo2);
        prateleira.inserir(bolo3);
        prateleira.inserir(bolo4);
        prateleira.inserir(torta1);
        prateleira.inserir(torta2);
        prateleira.inserir(torta3);
        prateleira.inserir(torta4);

        // Listagem completa
        prateleira.listar();

        // Teste de remoção pelo código
        System.out.println("\nRemovendo o bolo com código 103...");
        IBolo removido = prateleira.remover(103);
        System.out.println(removido != null ? "Removido: " + removido : "Bolo não encontrado");

        // Listagem após remoção
        prateleira.listar();

        // Teste de remoção por objeto
        System.out.println("\nRemovendo o bolo 101 por referência...");
        removido = prateleira.remover(bolo1);
        System.out.println(removido != null ? "Removido: " + removido : "Bolo ou torta não encontrado");

        // Teste de remoção por objeto inexistente
        System.out.println("\nTentando remover o bolo com código 110...");
        removido = prateleira.remover(110);
        System.out.println(removido != null ? "Removido: " + removido : "Bolo ou torta não encontrado");

        // Lista de bolos por tipo
        prateleira.listar('T');

        // Listagem final
        prateleira.listar();
    }
}
