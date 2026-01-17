package Assestment;

import java.util.*;

public class sum_digit {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    if(n==0){
        System.out.println("0");
    }else{
        while(n!=0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
    }
    System.out.println(sum);
}
}
