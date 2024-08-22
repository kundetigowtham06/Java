import java.util.*;
class Constructor{
	String name;
	int roll;
	Constructor(){
	name="Gotam";
	roll=7;
	}
	Constructor(String str,int num){
	name=str;
	roll=num;
	}
public static void main(String args[]){
	Constructor obj1=new Constructor();
	Constructor obj2=new Constructor("Deepak",2);
	System.out.println(obj1.name+" "+obj1.roll);
	System.out.println(obj2.name+" "+obj2.roll);
}
}
