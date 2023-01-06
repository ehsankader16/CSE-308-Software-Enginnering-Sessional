package observer.pattern.practice1;

public class User extends  Observer {
    public User(String name) {
        super(name);
    }

    @Override
    public void getNotification(String msg) {
        System.out.println(super.getObserverName()+" has received this alert: "+msg);
    }
}
