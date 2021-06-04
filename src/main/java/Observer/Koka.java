package Observer;

public class Koka implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Hey I'm Konstantine, I've received your news: " + news);
    }
}
