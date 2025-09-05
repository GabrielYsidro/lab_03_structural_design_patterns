package ejercicio1_check;

public class RPGGame extends Game{
    public RPGGame() {
        super();
    }
    @Override
    public void start() {
        System.out.println("Iniciando juego de RPG...");
    }
    @Override
    public String getInfo() {
        return " | Modo: RPG";
    }
}
