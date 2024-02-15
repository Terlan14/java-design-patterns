import java.util.ArrayList;
import java.util.List;

public class Weather
{
    //list of observers
    private final List<WeatherObserver> observers;
    private WeatherType currentWeather;

    //constructor
    public Weather() {
        observers=new ArrayList<>();
        currentWeather=WeatherType.SUNNY;
    }

    //add observer to observers object
    public void addObserver(WeatherObserver observer)
    {
        observers.add(observer);
    }
    //remove observer from observers object
    public void removeObserver(WeatherObserver observer)
    {
        observers.remove(observer);
    }
    //it's simple method which changes weather doncition
    public void timePasses() {
        var enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println(String.format("The weather changed to %s.",currentWeather));
        notifyObservers();
    }

    //method for notify all observers
    private void notifyObservers() {
        for (var obs : observers) {
            obs.update(currentWeather);
        }
    }
}
