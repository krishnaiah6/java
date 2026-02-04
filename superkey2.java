class  car{
    void display()
    {
        System.out.println("This is car");
    }
}
class lorry extends car
{
    void display()
    {
        super.display();   
        System.out.println("This is lorry");
        
    }
}
public class superkey2
{
    public static void main(String[] args) {
        lorry l=new lorry();
        l.display();
    }
}