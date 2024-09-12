public class Buffer{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        sb.delete(0,5);
        
        String message = sb.toString();
        System.out.println(message);
    }
}
