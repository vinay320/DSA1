//Hour Glass Solution
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] arr=new int[6][6];
        for (int i = 0; i <6; i++) {
            for (int j = 0; j <6 ; j++) {
                arr[i][j]=s.nextInt();
            }

        }   int sum1;
            int sum2;
            int sum3;
            int sum=0;
        for (int i = 0; i <6-2 ; i++) {

            for (int j = 0; j <6-2 ; j++) {
                sum1=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum2=arr[i+1][j+1];
                sum3=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum1+sum2+sum3>sum) {
                    sum = (sum1 + sum2 + sum3);
                }
            }
        }
        System.out.println(sum);
    }
}
