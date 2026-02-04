public class cons{
    String name;
    int age;
    cons(String n,int a)
    {
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println("name:"+name+","+"age:"+age);
    }
    public static void main(String[] args) {
        cons obj = new cons("teja", 10);
        obj.display();
    }
}
