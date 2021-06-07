package Decorator;

public class Hook extends WeaponDecorator {

    public Hook(Weapon weapon) {
        super(weapon);
    }

    @Override
    public double getDamage() {
        return weapon.getDamage() + 20.0;
    }

    @Override
    public String getDescription() {
        return weapon.getDescription() + ", Hook";
    }
}
