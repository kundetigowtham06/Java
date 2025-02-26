public class LL {
    public class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head = null;
    node tail = null;
    public void createNode(int data){
        node newNode =new node(data);
        if(head==null){
            head=newNode;
            tail=newNode;

        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void display(){
        node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String[] args) {
        LL obj=new LL();
        obj.createNode(24);
        obj.createNode(44);

        obj.display();
    }
    
}
