
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
        for (int i = 0; i < t1arr.length ; i++) {
            for (int j = 0; j < t1arr.length ; j++) {

                    if (t1arr[i].start < t1arr[j].start) {
                        TimeInterval temp = t1arr[i];
                        t1arr[i] = t1arr[j];
                        t1arr[j] = temp;


                }
            }
        }
        for (int i = 0; i < t1arr.length-1 ; i++) {
            if(t1arr[i].end>t1arr[i+1].start)
            {
                return false;
            }


        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        TimeInterval[] t1arr= new TimeInterval[n];
        for (int i = 0; i <n ; i++) {
            t1arr[i]=new TimeInterval(s.nextInt(),s.nextInt());
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
