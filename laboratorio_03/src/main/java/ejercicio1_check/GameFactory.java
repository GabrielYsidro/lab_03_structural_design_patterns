package ejercicio1_check;

public abstract class GameFactory {
    public GameFactory() {}
    public abstract Game MetodoGame();

    public static Game createGame(String gameType) {
        Game game = null;
        if (gameType.equals("FPS")) {
            game = new FPSFactory().MetodoGame();
        }
        if (gameType.equals("RPG")) {
            game = new RPGFactory().MetodoGame();
        }
        return game;
    }
}
