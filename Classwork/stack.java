package Classwork;
public class stack {
    int top;
    int max;
    int[] a;
    stack(int size){
        max=size;
        a=new int[max];
        top=-1;
    }
    void push(int ele){
        if(top==max-1){
            System.out.println("Stack Overflow");
            return;
        }
         top++;
         a[top]=ele;
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("deleted element is: "+a[top]);
         top--;
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("topmost element: "+a[top]);
    }
    void display(){
         if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stack m1=new stack(10);
        m1.display();
        m1.push(1);
        m1.push(2);
        m1.push(3);
        m1.display();
        m1.pop();
        m1.peek();
        m1.display();
    }
}
