package javapractice;

import java.io.*;
import java.util.*;

class Stack
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] stack = new int[n];
    int top = -1;
    void push(int i)
    {
        if(top==n-1)
        {
            System.out.print("Satck is full!");
        }
        else
        {
            top++;
            stack[top]=i;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.print("Satck is empty!");
        }
        else
        {
            top--;
        }
    }
    int peek()
    {
        int i = stack[top];
        return i;
    }
    boolean isFull()
    {
        int n = stack.length;
        if(top==n-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

public class Filo {
    
}