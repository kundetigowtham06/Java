class A{
    public void MethodA(){
        System.out.println("Hello Gotam");
    }
}
class B extends A{
    public void MethodB(){
        System.out.println("Hello Cr!");
    }
}
class C extends B{
    public void MethodC(){
        System.out.println("Hello Namaste");
    }
    public static void main(String args[]){
        C obj=new C();
        obj.MethodA();
        obj.MethodB();
        obj.MethodC();
    }
}
