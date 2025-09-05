package ejercicio3_check;

public class GameConfig {
    private static GameConfig instance;
    private String databaseUrl;
    private boolean debugMode;
    private int maxPlayers;

    private GameConfig() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/gamedb";
        this.debugMode = false;
        this.maxPlayers = 100;
    }

    public static GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String url) {
        this.databaseUrl = url;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debug) {
        this.debugMode = debug;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int max) {
        this.maxPlayers = max;
    }


}
