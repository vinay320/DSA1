// Binary Search using array....
import java.util.Scanner;

public class BinarySeach {
    static int Search(int[] arr,int search)
    {
        int f=0;
        int l=arr.length-1;

        while(f<=l)
        {  int mid=(f+l)/2;
            if(arr[mid]!=search)
            {
                if(arr[mid]>search)
                {
                    l=mid-1;
                    mid=(f+l)/2;
                }
                else if(arr[mid]<search)
                    {
                        f=mid+1;
                        mid=(f+l)/2;
                    }
            }else
            {
                return mid;
            }
        }
        return -1;
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
        System.out.println("Enter element to search");
        int search=s.nextInt();
        int t=(Search(arr,search));
        if(t!=-1)
        {
            System.out.println("Element Found at index " + (t + 1));
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
