// Bubble Sort using array Normal method;
import java.util.Scanner;

public class Sort {
    static void Sorting(int[] arr)
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j = 0; j < (arr.length-1-i); j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i:arr)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements");
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        Sorting(arr);
    }
}
