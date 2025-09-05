package ejercicio3_check;

public class Prueba
{
    public static void main(String[] args) {
        GameConfig config = GameConfig.getInstance();
        GameConfig config2 = GameConfig.getInstance();
        System.out.println(config == config2);
    }
}
