package ejercicio1_check;

public class FPSFactory extends GameFactory {
    @Override
    public Game MetodoGame() {
        return new FPSGame();
    }
}
