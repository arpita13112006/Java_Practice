package Assestment.Array;
import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                System.out.println(arr[i]+"->"+count);
                count=1;
            }
        }
        System.out.println(arr[n-1]+"->"+count);
    }
}
