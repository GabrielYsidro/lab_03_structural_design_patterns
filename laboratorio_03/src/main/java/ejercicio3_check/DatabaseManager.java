package ejercicio3_check;

public class DatabaseManager {

    public void saveData() {
        GameConfig config = GameConfig.getInstance();

        System.out.println("Guardando en: " + config.getDatabaseUrl());
        System.out.println("Máximo jugadores permitidos: " + config.getMaxPlayers());
    }
}
