package Assestment.MATH;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        if(n==1){
            flag=true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
