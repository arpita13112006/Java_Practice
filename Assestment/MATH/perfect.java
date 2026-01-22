package Assestment.MATH;
import java.util.*;
public class perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n && n!=0){
            System.out.println("perfect num");
        }else{
            System.out.println("not perfect number");
        }
    }
}
