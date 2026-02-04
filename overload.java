public class overload 
{
    int add(int side)
    {
        return side*side;
    }
    int area(int length,int breadth)//different types of parameters
    {
        return length*breadth;
    }
    double area(double radius)//different type of parameters
    {
        return 3.14*radius*radius;
    }    
    double area(double base,int height)//different order of parameters 
    {
        return 0.5*base*height;
    }
    public static void main(String[] args)
    {
        overload obj= new overload();
        System.out.println(obj.area(5));
        System.out.println(obj.area(4,5));
        System.out.println(obj.area(2.5));
        System.out.println(obj.area(3.2,8));

    }
}   

