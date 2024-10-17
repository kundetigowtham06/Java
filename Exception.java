import java.lang.*;
public class Hello{
    public static void main(String args[]){
        //Arthemetic Exception
        try{
            int a=10/0;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
        //ArrayOutOfBound
        try{
            
            int a[]={1,2,3,45};
            System.out.println(a[10]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        //NullPointerException
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
