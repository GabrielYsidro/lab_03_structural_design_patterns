package ejercicio1_check;

public abstract class Game {
    private String name;
    private String genre;

    public Game() {

    }
    public abstract void start();
    public abstract String getInfo();
}
