//Linear Search using array...
import java.util.Scanner;

public class LinearSearch {

    static boolean Search(int[] arr,int search)
    {
        for (int j : arr) {
            if (j == search) {
                return true;
            }

        }
        return false;
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
        boolean t=(Search(arr,search));
        if(t)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }

    }
}
