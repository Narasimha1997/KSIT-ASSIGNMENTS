package com.company;

import java.util.Scanner;
public class Stack {
    int size, top=-1;
    int[] stack_arr;
    Scanner r;
    Stack(int size){
        this.size=size;
        stack_arr=new int[size];
        r=new Scanner(System.in);
    }
    private void push(){
        if(top==size-1)
            System.out.println("Stack Overflow");
        else{
            System.out.println("Enter the element: ");
            stack_arr[++top]=r.nextInt();
        }
    }
    private void pop(){
        if(top==-1)
            System.out.println("Stack underflow");
        else
            System.out.println("Poped element is: "+stack_arr[top--]);
    }
    private void display(){
        if(top==-1)
            System.out.println("Stack is empty");
        else{
            for(int i=top; i>-1; i--)
                System.out.println(stack_arr[i]);
        }
    }
    public void stack_operator(){
        System.out.println("Stack operations:  ");
        while(true){
            System.out.println("1. Push 2.Pop 3.Display 4.exit");
            int n=r.nextInt();
            switch (n){
                case 1: push(); break;
                case 2: pop(); break;
                case 3: display(); break;
                case 4: return;
            }
        }
    }
}
