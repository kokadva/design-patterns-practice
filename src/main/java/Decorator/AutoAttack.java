package Decorator;

public class AutoAttack implements Weapon {
    @Override
    public double getDamage() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Auto Attack";
    }
}
