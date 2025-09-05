package ejercicio2_check;

public class PCFactory extends GameElementCreator{

    @Override
    public Character createCharacter() {
        return new PCWarrior();
    }
    public Weapon createWeapon() {
        return new PCSword();
    }
}
