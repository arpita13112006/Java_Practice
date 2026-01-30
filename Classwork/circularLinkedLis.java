package Classwork;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class circularLinkedLis{
    Node head=null;
    void addfirst(int d){
        Node newNode =new Node(d);
        if(head==null){
            head=newNode;
            head.next=head;
            return;
        }
        Node temp=head;
        while(temp.next != head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
        head=newNode;
    }
    void addlast(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            head.next=head;
            return;
        }
        Node temp=head;
        while(temp.next !=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }
    void deletefirst(){
        if(head==null){
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=head.next;
        head=head.next;
    }
    void deletelast(){
        if(head==null){
            return;
        }
    if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
    }

    void display(){
        if(head==null)return;
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);
    }
    public static void main(String[] args) {
       circularLinkedLis s1=new circularLinkedLis();
       s1.addfirst(1);
       s1.addfirst(2);
       s1.addfirst(3);
       s1.addlast(4);
       s1.addlast(5);
       s1.display();
       System.out.println();
       s1.deletefirst();
       s1.display();
       System.out.println();
       s1.deletelast();
       s1.display();
		}
}


