public class stringbuilder {
    public static void main(String[] args) {
        String s="krishna";
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" Krishna");
        s="Hello "+s;
        System.out.println(sb);
        System.out.println(s);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        
    }
    
}
