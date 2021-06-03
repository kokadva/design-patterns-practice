package Strategy;

public class Dragon extends Character {
    public Dragon() {
        this.setMoveBehaviour(new FlyingMoveBehaviour());
    }
}
