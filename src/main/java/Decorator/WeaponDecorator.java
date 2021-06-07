package Decorator;

public abstract class WeaponDecorator implements Weapon {

    protected Weapon weapon;

    public WeaponDecorator(Weapon weapon) {
        this.weapon = weapon;
    }
}
