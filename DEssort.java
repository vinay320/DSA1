// Decresing order insertion and bubble sort
import java.util.Scanner;

public class DEssort {
    static void sort(int[] arr)
    {
        for (int i =0; i<=arr.length-1; i++)
        {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            /* InsertionSort......
            for (int i = 0; i <arr.length ; i++)
        {
            int temp=arr[i];
            int pos=i-1;
            while (pos>=0 && temp>arr[pos])
            {
                arr[pos+1]=arr[pos];
                pos=pos-1;
            }
            arr[pos+1]=temp;
        }
             */
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        sort(arr);

    }
}
