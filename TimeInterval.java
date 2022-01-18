import java.util.Scanner;

public class TimeInterval {
    int start;
    int end;

    public TimeInterval(int start, int end) {
        this.start = start;
        this.end = end;
    }
    static boolean canAttendMeeting(TimeInterval t1arr[])
    {   int a,b;
        for (int i = 0; i <t1arr.length ; i++) {
           a=t1arr[i].start;
           b=t1arr[i].end;
            for (int j = 0; j <t1arr.length ; j++) {
                if(i!=j)
                {
                    if(t1arr[j].start>a)
                    {
                        if (t1arr[j].start<b)
                        {
                            return false;
                        }
                        else
                        {
                            return true;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        TimeInterval t1arr[]= new TimeInterval[n];
        for (int i = 0; i <n ; i++) {
            t1arr[i]=new TimeInterval(s.nextInt(),s.nextInt());
        }
        System.out.println(canAttendMeeting(t1arr));

    }
}
