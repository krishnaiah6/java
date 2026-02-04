import java.util.*;
public class calc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.println();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.println();
        System.out.println("select operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int o=sc.nextInt();
        switch(o)
        {
        case 1:
            System.out.println(a+b);
            break;
        case 2:
            System.out.println(a-b);
            break;
        case 3:
            System.out.println(a*b);
            break;
        case 4:
            System.out.println(a/b);
            break;
        default:
            System.out.println("choose valid operation");
        
        }
    }
}