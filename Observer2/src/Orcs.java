public class Orcs implements WeatherObserver{
    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("Orcs are facing "+currentWeather.getDescription()+" weather now");
    }
}
