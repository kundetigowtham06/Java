class A{
    String name="Gowtham";
    int roll=7;
    String college="Vitb";
}
class B extends A{
    String Fname="Deepak";
    String branch="Cse";
    int ssn=8;
    void display(){
        System.out.println("Name of student="+name);
        System.out.println("roll="+roll);
        System.out.println("college="+college);
        System.out.println("Name of Faculty="+Fname);
        System.out.println("Branch name="+branch);
        System.out.println("SSN="+ssn);

    }
    public static void main(String args[]){
        B obj=new B();
        obj.display();
    }
}
