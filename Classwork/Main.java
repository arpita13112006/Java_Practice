package Classwork;
class Node{
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
    }
}
public class Main {
    Node head=null;
    void addfirst(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void traverse(){
        if(head==null){
            System.out.println();
        }
    }
    public static void main(String[] args) {
       
		}
}


