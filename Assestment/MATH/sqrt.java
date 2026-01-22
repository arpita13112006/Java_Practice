package Assestment.MATH;
import java.util.*;
public class sqrt {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println(0);
        }
        int left=0;
        int right=n;
        int result=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid<=n/mid){
                result=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println(result);
     }
}
