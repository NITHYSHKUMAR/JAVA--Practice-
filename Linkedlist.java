package javapractice;
import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;

    }
}
class Linked{
        Node head=null;
        Node tail=null;
        int size=0;
        void create(){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the data=");
             int data=s.nextInt();
             Node newnode=new Node(data);
             size++;
         if(head==null)
         {
            head=newnode;
            tail=newnode;
         }
         else{
            tail.next=newnode;
            tail=newnode;
           
         }

            }

        void insertatbegin()
        {
          if(head==null){  
            create();}
          else{
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the data=");
            int data=s.nextInt();
            Node newnode=new Node(data);
            newnode.next=head;
            head=newnode;
            size++;

         }

        }
        void insertatposition()
        {
              Scanner s=new Scanner(System.in);
                System.out.println("Enter the data=");
                int data=s.nextInt();
                System.out.println("enter the insert position=");
                int position=s.nextInt();
                Node newnode=new Node(data);
                if(position==1)
                {
                          insertatbegin();
                }
                else{
                    Node temp=head;
                    int i=1;
                    while(i<position-1)
                    {
                        temp=temp.next;
                        i++;

                    }
                    newnode.next=temp.next;
                    temp.next=newnode;
                    size++;


                }
                
        }
        void insertatlast()
        {
            create();
        }
        void deleteatfirst()
        {
            if(head==null){
                System.out.println("Linked List is empty... Cannot delete note");
            }
            else{
                head=head.next;
                size--;
            }
        }
        void deleteatlast(){
            Node temp=head;
            while(temp.next!=tail)
            {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
     void deleteatposition()
     {
                Scanner s=new Scanner(System.in);
                System.out.println("enter the delete position=");
                int position=s.nextInt();
                if(position==size)
                {
                    deleteatlast();
                 
                }
                else{
                    Node temp=head;
                    int i=1;
                    while(i<position-1)
                    {
                        temp=temp.next;
                        i++;

                    }
                    temp.next=temp.next.next;
                }
     }

        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" --->");
                temp=temp.next;

            }
            System.out.println("END");
            System.out.println();
        }
}
class LinkedList{
    public static void main(String[] args) {
      
        Linked l=new Linked();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            l.create();

        }
        // System.out.println("1.create list\n 2.Insert at the begining\n 3.Insert at position\n 4.Insert at end\n5.Delete at begining\n6. Delete at position\n7.Delete at last\n\nEnter the choice:");
        // int choice =sc.nextInt();
        // switch(choice)
        // {   
        //     case 1:
        //         if(choice==1)
        //         {
        //                  l.create();
        //         }
        //     case 2:
        //        if(choice==2)
        //        {
        //            l.insertatbegin();
        //        }
        //     case 3:
        //     {
        //         if(choice==3)
        //         {
        //             l.insertatposition();
        //         }
        //     }
        //     case 4:
        //        {
        //         if (choice==4)
        //         {
        //             l.insertatlast();
        //         }
        //        }
        //        case 5:
        //        {
        //         if(choice==5)
        //         {
        //             l.deleteatfirst();
        //         }
        //        }
        //        case 6:
        //        {
        //         if(choice==6)
        //         {
        //             l.deleteatposition();
        //         }
        //        }
        //        case 7:
        //        {
        //         if(choice==7)
        //         {
        //             l.deleteatlast();
        //         }
        //        }
        //        default:
        //          System.out.println("enter a valid choice!!!");
        // }        
        // l.display();
        l.deleteatposition();
        l.display();
    }
  }

