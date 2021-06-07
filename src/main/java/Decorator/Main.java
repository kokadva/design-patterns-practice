package Decorator;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Hook(new DeathFromBelow(new AutoAttack()));
        System.out.println(weapon.getDamage());
        System.out.println(weapon.getDescription());
    }

}
