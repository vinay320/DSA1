// Singly Linked List...

import java.util.Scanner;
class Node
{
    int rollno;
    Node next;
}
public class SinglyLinkedList
{   Node Start;
    SinglyLinkedList()
    {
        Start=null;
    }
    void insert()
    {
        System.out.println("Enter Your rollno ");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();

        Node n=new Node();
        n.rollno=data;
        n.next=null;

        if(Start==null)
        {
            Start=n;
        }
        else
        {
            Node current=Start;
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
        Node current;
        for(current=Start;current!=null;current=current.next)
        {
            System.out.print(" "+current.rollno);
        }
    }
    }
    public static void main(String[] args)
    {
        SinglyLinkedList obj = new SinglyLinkedList();
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int choice=sc.nextInt();

            switch (choice) {
                case 1 -> obj.insert();
                case 2 -> obj.delete();
                case 3 -> obj.traverse();
                case 4 -> System.exit(0);
                default -> System.out.println("Wrong Choice");
            }
        }
    }
}
