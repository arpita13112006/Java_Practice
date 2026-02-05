package Assestment.Array;
import java.util.*;
public class mergesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<>();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int j=sc.nextInt();
        for(int i=0;i<k;i++){
            li.add(a[i]);
        }
        for(int i=0;i<j;i++){
            li.add(b[i]);
        }
        Collections.sort(li);
        for(int i=0;i<li.size();i++){
            a[i]=li.get(i);
        System.out.print(a[i]+" ");
        }
    }
}
