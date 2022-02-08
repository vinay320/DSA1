//Rearrange even odd
import java.util.Scanner;

public class Rearrange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int c=0;
        for (int i = 0; i < n; i++) {
           arr[i]=s.nextInt();
           if(arr[i]%2==0)
           {
               c++;
           }
        }int j=0;
        int[] a=new int[n];
        for (int i = 0; i <n; i++) {

            if(arr[i]%2==0)
            {
                a[j]=arr[i];
                j++;
            }
            else
            {
                a[c]=arr[i];
                c++;
            }
        }
        for (int i:a)
        {
            System.out.println(i);
        }
    }
}
