// Input :  neeraj
//Output :  n -> e -> e -> r -> a -> j

import java.util.Scanner;
class Node1
{
    char rollno;
    Node1 next;
}
public class LinkedList1
{   Node1 Start;
    LinkedList1()
    {
        Start=null;
    }
    void insert(char c)
    {
        Node1 n=new Node1();
        n.rollno=c;
        n.next=null;

        if(Start==null)
        {
            Start=n;
        }
        else
        {
            Node1 current=Start;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=n;
        }
        System.out.println("Data Inserted...");

    }
    void delete()
    {   if(Start==null)
    {
        System.out.println("List Empty");
    }
    else
    {   System.out.println("deleted: "+Start.rollno);
        if(Start.next==null)
        {
            Start=null;
        }
        else
        {
            Start=Start.next;
        }
    }
    }
    void traverse()
    {   if(Start==null)
    {
        System.out.println("List Empty");
    }
    else
    {
        Node1 current;
        for(current=Start;current!=null;current=current.next)
        {
            System.out.print(current.rollno);
            if(current.next!=null)
            {
                System.out.print("->");
            }
        }
    }
    }
    public static void main(String[] args)
    {
        LinkedList1 obj = new LinkedList1();
       Scanner s=new Scanner(System.in);
        System.out.println("Enter String");
        String a=s.nextLine();
        for(int i=0;i<a.length();i++)
        {
            obj.insert(a.charAt(i));
        }
        obj.traverse();
    }
}
