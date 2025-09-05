package ejercicio1_check;

public class Prueba {
    public static void main(String[] args) {
        GameFactory factory = new FPSFactory();
        Game game = factory.MetodoGame();
        game.start();

        factory = new RPGFactory();
        game = factory.MetodoGame();
        game.start();
    }
}
