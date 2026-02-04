public class thiskey {
    String name;
    int age;
    thiskey(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("name:"+name+ " age:"+age);
    }
    public static void main(String a[])
    {
        thiskey t=new thiskey("krishna",20);
        t.display();
    }
    
}
