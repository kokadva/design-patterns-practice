package Observer;

public class Main {

    public static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Subject subject = new KutaisiNewspaper();
        Observer koka = new Koka();
        Observer basila = new Basila();
        subject.registerObserver(koka);
        subject.registerObserver(basila);
        sleep();
        subject.removeObserver(basila);
        sleep();
        subject.registerObserver(basila);
    }
}
