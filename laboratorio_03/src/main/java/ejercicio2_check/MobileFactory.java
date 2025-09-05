package ejercicio2_check;

public class MobileFactory extends GameElementCreator {

    @Override
    public Character createCharacter() {
        return new MobileWarrior();
    }

    @Override
    public Weapon createWeapon() {
        return new MobileSword();
    }
}
