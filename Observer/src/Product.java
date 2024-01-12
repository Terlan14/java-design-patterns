import java.util.ArrayList;
import java.util.List;

public class Product implements  Subject{
    private String productName;
    List<Observer> observers=new ArrayList<Observer>();

    private boolean available;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        if(available==true)
            notifyObservers();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying all registered customers , when product becomes available. ");
        for(Observer observer:observers){
            observer.update(productName);
        }

    }
}
