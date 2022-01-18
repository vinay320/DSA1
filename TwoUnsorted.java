import java.util.Scanner;

public class TwoUnsorted {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for (int i = 0; i <n ; i++)
        {
            arr1[i]=s.nextInt();
        }
        for (int i = 0; i <n ; i++)
        {
            arr2[i]=s.nextInt();
        }

        int arr3[]=new int[n];
        for (int i = 0; i <n; i++)
        {   int c=0;
            for (int j = 0; j <n ; j++)
            {
                if(arr1[i]<=arr2[j])
                {
                    c++;
                }
            }

            arr3[i]=c;

        }
        for (int i = 0; i < n; i++) {
            {
                System.out.print(arr3[i]+" ");
            }
        }

    }
}
