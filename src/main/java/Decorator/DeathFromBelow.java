package Decorator;

public class DeathFromBelow extends WeaponDecorator {
    public DeathFromBelow(Weapon weapon) {
        super(weapon);
    }

    @Override
    public double getDamage() {
        return weapon.getDamage() + 40.4;
    }

    @Override
    public String getDescription() {
        return weapon.getDescription() + ", Death From Below <3";
    }
}
