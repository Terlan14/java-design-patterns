public class Hobbits implements WeatherObserver{
    //it's method when weather is changed hobbits are notificated
    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("Hobbits are facing "+currentWeather.getDescription()+" weather now");
    }
}
