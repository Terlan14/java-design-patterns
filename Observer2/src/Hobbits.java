public class Hobbits implements WeatherObserver{
    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("Hobbits are facing "+currentWeather.getDescription()+" weather now");
    }
}
