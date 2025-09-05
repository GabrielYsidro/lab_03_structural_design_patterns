package ejercicio1_check;

public class FPSGame extends Game {
    public FPSGame() {
        super();
    }

    @Override
    public void start() {
        System.out.println("Cargando mapa de combate...");
        System.out.println("Selecciona tu arma inicial");
    };
    @Override
    public String getInfo() {
        return " | Modo: FPS";
    }
}
