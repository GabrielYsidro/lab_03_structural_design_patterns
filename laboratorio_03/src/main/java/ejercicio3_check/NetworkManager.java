
package ejercicio3_check;

public class NetworkManager {

    public void connect() {
        GameConfig config = GameConfig.getInstance();

        System.out.println("Conectando a: " + config.getDatabaseUrl());
        System.out.println("Debug mode: " + config.isDebugMode());
    }
}
