package Assestment;
import java.util.*;
public class palindrom {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(rev==original){
            System.out.println("palindrome num");
        }else{
            System.out.println("not palindrome");
        }
     }
}
