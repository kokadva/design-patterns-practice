package Strategy;

public class Character {

    private MoveBehaviour moveBehaviour;

    public void setMoveBehaviour(MoveBehaviour moveBehaviour) {
        this.moveBehaviour = moveBehaviour;
    }

    public void makeMove(){
        this.moveBehaviour.move();
    }
}
