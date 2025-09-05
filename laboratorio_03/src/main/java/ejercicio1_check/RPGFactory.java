package ejercicio1_check;

public class RPGFactory extends GameFactory{
    @Override
    public Game MetodoGame() {
        return new RPGGame();
    }
}
