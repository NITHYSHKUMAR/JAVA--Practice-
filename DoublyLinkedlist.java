package javapractice;

import java.util.Scanner;

class Node{
        int data;
        Node next;
        Node pre;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.pre=null;
        }
    }
class DoublyLinkedlist {

    Node head=null;
    Node tail=null;
    int size=0;
    void create()
    {       
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the data=");
            int data=s.nextInt();
            Node newnode=new Node(data);
            size++;

            if(head==null)
            {
                head=newnode;
                newnode.next=head;
                newnode.pre=null;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
    }
}

