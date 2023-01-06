package observer.pattern.practice1;

public abstract class Observer {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public String getObserverName() {
        return this.name;
    }

    public abstract void getNotification(String msg);
}
