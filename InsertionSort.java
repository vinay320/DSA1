// Insertion Sort
public class InsertionSort {
    static void sort(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++)
        {
            int temp=arr[i];
            int pos=i-1;
            while (pos>=0 && temp<arr[pos])
            {
                arr[pos+1]=arr[pos];
                pos=pos-1;
            }
            arr[pos+1]=temp;
        }
    }
    static void print(int[] arr)
    {
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
        int[] arr={20,4,32,5,6};
        sort(arr);
        print(arr);
    }
}
