class car
{
    void vehicle()
    {
      System.out.println("This is vehicle");
    }    
}
class carbrake extends car{
    void brake()
    {
        System.out.println("This is brake of car");
    }
}
class carbelt extends carbrake{
    void belt()
    {
        System.out.println("This is seatbelt");
    }
}
public class inherit{
    public static void main(String[] args) {
        carbelt obj=new carbelt();
        obj.vehicle();
        obj.brake();
        obj.belt();
    }

}
