package com.company;

import java.util.Scanner;
public class Queue {
    int front=0, rear=-1, max_size;
    int[] queue_arr;
    Scanner s;
    Queue(int size){
        max_size=size;
        queue_arr=new int[max_size];
        s=new Scanner(System.in);
    }
    private void insert(){
        if(rear==max_size-1)
            System.out.println("Queue is full");
        else{
            System.out.println("Enter the element to insert: ");
            queue_arr[++rear]=s.nextInt();
        }
    }
    private void delete(){
        if(front>rear)
            System.out.println("No element to delete");
        else
            System.out.println("Deleted element is: "+queue_arr[front++]);
    }
    private void display(){
        if(front>rear)
            System.out.println("Queue is empty");
        else{
            for(int i=front; i<=rear; i++)
                System.out.println(queue_arr[i]);
        }
    }
    public void queue_operator(){
        System.out.println("Queue operations:  ");
        while(true){
            System.out.println("1. Insert 2.Delete 3.Display 5.exit");
            int n=s.nextInt();
            switch (n){
                case 1: insert(); break;
                case 2: delete(); break;
                case 3: display(); break;

                case 4: return;
            }
        }
    }
}
