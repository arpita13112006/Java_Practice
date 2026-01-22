package Assestment.Array;
import java.util.*;
public class duplicate {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(i<n-1 && arr[i]==arr[i+1]){
                continue;
            }else{
                arr[count]=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
