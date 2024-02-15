public class Orcs implements WeatherObserver{
    //it's method when weather is changed orcs are notificated
    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("Orcs are facing "+currentWeather.getDescription()+" weather now");
    }
}
