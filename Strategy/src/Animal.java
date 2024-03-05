public class Animal {
    //declare Flys type
    public Flys flys;
    Animal(){
    }
    //flying for their type  instantiate ItFlys or CantFly
    public String tryToFly(){
        return flys.fly();
    }
    //changing their ability of flying maybe Bird already couln't fly or Dog could fly
    public void setFlyingAbility(Flys newFlys){
        flys=newFlys;
    }
}
