package observer.pattern.practice1;

public class ConcreteStock extends Stock{
    public ConcreteStock(String name) {
        super(name);
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
        System.out.println(this.getName()+" registers "+ o.getObserverName());
    }

    @Override
    public void unRegister(Observer o) {
        observerList.remove(o);
        System.out.println(this.getName()+" unregisters "+ o.getObserverName());
    }

    @Override
    public void notifyRegisteredUsers(String msg) {
        for(Observer observer: observerList) {
            observer.getNotification(msg);
        }
    }
}
