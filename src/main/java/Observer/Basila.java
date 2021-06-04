package Observer;

public class Basila implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Hey I'm Basilka, I've received your news: " + news);
    }
}
