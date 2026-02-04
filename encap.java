class bankaccount
{
    private double balance;
    public void deposit(double amount)
    {
        balance+=amount;
    }    
    public double getbalance()
    {
        return balance;
    }
}
public class encap
{
    public static void main(String[] args)
    {
    bankaccount obj=new bankaccount();
    obj.deposit(5000);
    System.out.println(obj.getbalance());
    }
}
