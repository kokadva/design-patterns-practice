package Strategy;

public class Human extends Character{

    public Human() {
        this.setMoveBehaviour(new WalkMoveBehaviour());
    }
}
