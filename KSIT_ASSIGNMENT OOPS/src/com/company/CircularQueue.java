package com.company;

import java.util.Scanner;

/**
 * Created by narasimha on 3/27/17.
 */
public class CircularQueue {
    int front=0, rear=-1;
    int[] circular_q;
    int size, count=0;
    Scanner r;
    CircularQueue(int size){
        this.size=size;
        circular_q=new int[size];
        r=new Scanner(System.in);
    }
    private void insert(){
        if(count==size)
            System.out.println("C_Queue full");
        else{
            System.out.println("Enter the element ot be inserted:");
            rear=(rear+1)%size;
            circular_q[rear]=r.nextInt();
            count++;
        }
    }
    private void delete(){
        if(count==0)
            System.out.println("Queue is empty");
        else{
            System.out.println("Deleted element is: "+circular_q[front]);
            front=(front+1)%size;
            count--;
        }
    }
    private void display(){
        if(count==0)
            System.out.println("Circular queue is empty");
        else{
            int i=front;
            int j=count;
            while(j!=0){
                System.out.println(circular_q[i]);
                i=(i+1)%size;
                j--;
            }
        }
    }
    public void circular_queueOP(){
        System.out.println("Stack operations:  ");
        while(true){
            System.out.println("1. Insert 2.Delete 3.Display 4.exit");
            int n=r.nextInt();
            switch (n){
                case 1: insert(); break;
                case 2: delete(); break;
                case 3: display(); break;
                case 4: return;
            }
        }
    }
}
