//uses inheritance
class Animal
{
    void sound()
    {
        System.out.println("animal makes sound");
    } 
}
class dog extends Animal{
    void sound()
    {
        System.out.println("dog barks");
    }
}
public class override
{
    public static void main(String[] args) 
    {
        Animal obj=new Animal();
        obj.sound();
        Animal obj1=new dog();
        obj1.sound();
        dog obj2=new dog();
        obj2.sound();;

    }
}
