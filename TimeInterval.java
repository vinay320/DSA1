
import java.util.Scanner;

public class TimeInterval {
    int start;
    int end;

    public TimeInterval(int start, int end) {
        this.start = start;
        this.end = end;
    }
    static boolean canAttendMeeting(TimeInterval[] t1arr)
    {
        try {
        for (int i = 0; i < t1arr.length ; i++) {
            for (int j = 0; j < t1arr.length ; j++) {

                    if (t1arr[i].start < t1arr[j].start) {
                        TimeInterval temp = t1arr[i];
                        t1arr[i] = t1arr[j];
                        t1arr[j] = temp;
                    }

                }
            }
        }catch (Exception e)
        {
            //System.out.println(e.getMessage());
        }int c=0;
        try {

        for (int i = 0; i < t1arr.length-1 ; i++) {
            if (t1arr[i].end > t1arr[i + 1].start) {
                c=0;
            }
            else {
                c=1;
            }

        }
        }catch (Exception e)
        {
            //System.out.println(e.getMessage());
        }
        return c==1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a1,b1;
        TimeInterval[] t1arr= new TimeInterval[n];
        try {

        for (int i = 0; i <n ; i++) {
            a1 = s.nextInt();
            b1 = s.nextInt();
            if (a1<b1) {
                t1arr[i] = new TimeInterval(a1, b1);
            } 
        }
        }catch (NullPointerException e)
        {
            //System.out.println(e.getMessage());
        }
        if(canAttendMeeting(t1arr))
        {
            System.out.println("Can Attend Meeting");
        }
        else
        {
            System.out.println("Cannot Attend Meeting");
        }

    }
}
