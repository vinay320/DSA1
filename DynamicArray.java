import java.util.*;
public class DynamicArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter N");
        int n=s.nextInt();
        System.out.println("Enter no Queries");
        int q=s.nextInt();
        int[][] arr=new int[q][3];

        System.out.println("Enter Values");
        for (int i=0;i<q;i++)
        {
            for (int j = 0; j <3 ; j++) {
                arr[i][j]=s.nextInt();
            }
        }

        List<Integer> obj1= new ArrayList<>();
        List<Integer> obj2= new ArrayList<>();
        int lastAnswer=0;
        for (int i=0;i<q;i++)
        {
            if(arr[i][0]==1)
                {
                    int idx=((arr[i][1])^lastAnswer)%n;
                    if(idx==0)
                    {
                        obj1.add(arr[i][2]);

                    }
                    else
                    {
                        obj2.add(arr[i][2]);

                    }
                }
                else if(arr[i][0]==2)
                {
                    int idx=((arr[i][1])^lastAnswer)%n;
                    if(idx==0)
                    {
                        lastAnswer=obj1.get(arr[i][2]);
                        System.out.println(lastAnswer);
                    }
                    else
                    {
                        lastAnswer=obj2.get(arr[i][2]);
                        System.out.println(lastAnswer);
                    }
                }

        }

    }

    }

