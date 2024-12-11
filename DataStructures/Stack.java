public class Stack {
    public class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node top=null;
    public boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }
    public void push(int data){
        node ptr=new node(data);
        if(isEmpty()){
            top=ptr;
            return;
        }
        ptr.next=top;
        top=ptr;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int t=top.data;
        top=top.next;
        return t;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return top.data;
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(4);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
