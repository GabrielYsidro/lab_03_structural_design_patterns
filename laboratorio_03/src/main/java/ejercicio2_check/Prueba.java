package ejercicio2_check;

public class Prueba {
    public static void main(String[] args) {
        // Seleccionamos la familia de productos (PC)
        GameElementCreator factory = new PCFactory();
        Character warrior = factory.createCharacter();
        Weapon sword = factory.createWeapon();

        warrior.attack();
        sword.use();

        // Podemos cambiar la familia fácilmente (Mobile)
        factory = new MobileFactory();
        warrior = factory.createCharacter();
        sword = factory.createWeapon();

        warrior.attack();
        sword.use();
    }
}
