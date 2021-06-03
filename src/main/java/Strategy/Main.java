package Strategy;

public class Main {

    public static void main(String[] args) {
        Character character1 = new Human();
        Character character2 = new Dragon();
        Character character3 = new Character();
        character3.setMoveBehaviour(() -> System.out.println("I won't move :D"));
        character1.makeMove();
        character2.makeMove();
        character3.makeMove();
        character1.setMoveBehaviour(new FlyingMoveBehaviour());
        character1.makeMove();

    }
}
