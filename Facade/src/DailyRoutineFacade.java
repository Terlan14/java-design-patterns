public class DailyRoutineFacade {
    Alarm alarm=new Alarm();
    Bathroom bathroom=new Bathroom();
    Bedroom bedroom=new Bedroom();
    Plan plan=new Plan();
    public void wakeUp(){
        alarm.turnOff();
        bathroom.morningRoutine();
        bedroom.makeBed();
        plan.checkPlans();
    }
    public void sleep(){
        alarm.turnOn();
        bathroom.eveningRoutine();
        bedroom.openBed();
        plan.writePlan();
    }
}
