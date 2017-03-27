package com.company;

import java.util.Scanner;

public class Main {
    static CircularQueue obj;
    static Queue obj2;
    static Stack obj3;
    static Scanner s;
    private static void class_loader(){

        s=new Scanner(System.in);
        System.out.println("Enter the size of all data structures: ");
        int n=s.nextInt();
        obj=new CircularQueue(n);
        obj2=new Queue(n);
        obj3=new Stack(n);

    }

    public static void main(String[] args) {
        class_loader();
        while(true){
            System.out.println("1. Stack 2. Queue 3. Circular Queue 4. Re-init 5. Exit");
            switch (s.nextInt()){
                case 1: obj3.stack_operator(); break;
                case 2: obj2.queue_operator(); break;
                case 3: obj.circular_queueOP(); break;
                case 4: class_loader(); break;
                case 5: System.exit(0);
            }
        }
    }
}
