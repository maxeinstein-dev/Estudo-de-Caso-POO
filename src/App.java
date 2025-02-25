public class App {

    public static void main(String[] args) {
        // Criando uma instância da prateleira (máximo de 5 bolos)
        VetorPrateleira prateleira = new VetorPrateleira(5);

        // Criando alguns bolos para cadastro
        BoloSimples bolo1 = new BoloSimples(101, 50.0, "quadrado");
        BoloSimples bolo2 = new BoloSimples(102, 40.0, "retangular");
        BoloSimples bolo3 = new BoloSimples(103, 60.0, "circular", true);
        Torta torta1 = new Torta(104, 80.0, "retangular");
        Torta torta2 = new Torta(105, 75.0, "quadrado", false, true);

        // Testando o cadastro dos bolos
        System.out.println("Tentando inserir bolos na prateleira...");
        prateleira.inserir(bolo1);
        prateleira.inserir(bolo2);
        prateleira.inserir(bolo3);
        prateleira.inserir(torta1);
        prateleira.inserir(torta2);
        System.out.println("Bolinho simples 101: " + bolo1);
        System.out.println("Bolinho simples 102: " + bolo2);
        System.out.println("Bolinho simples 103: " + bolo3);
        System.out.println("Torta 104: " + torta1);
        System.out.println("Torta 105: " + torta2);

        // Tentando inserir um bolo duplicado
        System.out.println("\nTentando inserir um bolo com código duplicado (101)...");
        BoloSimples boloDuplicado = new BoloSimples(101, 45.0, "circular");
        prateleira.inserir(boloDuplicado); // Deve falhar devido ao código duplicado

        // Listagem de bolos cadastrados na prateleira
        System.out.println("\nListagem dos bolos na prateleira:");
        prateleira.listar();

        // Removendo um bolo da prateleira
        System.out.println("\nRemovendo o bolo com código 103...");
        prateleira.remover(103); // Remover o bolo com código 103 (bolo3)
        prateleira.listar();

        // Tentando remover um bolo que não existe
        System.out.println("\nTentando remover um bolo com código inexistente (999)...");
        prateleira.remover(999); // Não existe bolo com código 999

        // Remover outro bolo e listar novamente
        System.out.println("\nRemovendo o bolo com código 104...");
        prateleira.remover(104); // Remover torta1
        prateleira.listar();

        // Inserindo novamente e listando
        System.out.println("\nInserindo novamente o bolo com código 104...");
        prateleira.inserir(torta1); // Inserindo novamente a torta1
        prateleira.listar();
    }
}
