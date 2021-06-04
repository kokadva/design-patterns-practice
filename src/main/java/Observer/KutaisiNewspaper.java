package Observer;

import java.util.ArrayList;
import java.util.List;

public class KutaisiNewspaper implements Subject {

    private List<Observer> observers;
    private String news;

    public KutaisiNewspaper() {
        this.observers = new ArrayList<Observer>();
        new Thread(() -> {
            int k = 0;
            while (k < 20) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                news = "News " + k;
                notifyObservers();
                k++;
            }
        }).start();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int k = 0; k < this.observers.size(); k++) {
            this.observers.get(k).update(this.news);
        }
    }
}
