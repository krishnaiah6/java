public class recursion {
    int fact(int n)
    {
        if(n<=1){
        return 1;
        }
        else{
            return n*fact(n-1);        }
    }
    public static void main(String[] args) {
        recursion r=new recursion();
        int res=r.fact(5);
        System.out.println(res);
        
    }
}
