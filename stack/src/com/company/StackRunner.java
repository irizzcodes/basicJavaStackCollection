package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class StackRunner {
    public static void main (String[] args) {
        StackClass stackClass = new StackClass();
        ArrayList<Integer> popNums = new ArrayList<>();
        ArrayList<Integer> randomList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        while (choice != 8) {
            System.out.println("1. Generate Random Number");
            System.out.println("2. Empty Random Number");
            System.out.println("3. Get Random Number List");
            System.out.println("4. Add Random Numbers to Stack");
            System.out.println("5. Pop Number from Stack");
            System.out.println("6. Get Popped Numbers");
            System.out.println("7. Display All the Popped Numbers");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stackClass.generateRandom();
                    System.out.print("Generate Random Numbers Successfully");
                    break;
                case 2:
                    stackClass.emptyRandom();
                    System.out.println("Clear Random Numbers Successfully");
                    break;
                case 3:
                    randomList = stackClass.getRandomList();
                    System.out.println("Get Random Number List Successfully");
                    System.out.println(randomList);
                    break;
                case 4:
                    stackClass.stackAdd(randomList);
                    System.out.println("Add Random Numbers to Stack Successfully");
                    break;
                case 5:
                    stackClass.stackPop();
                    System.out.println("Pop Number from Stack Successfully");
                    break;
                case 6:
                    popNums = stackClass.getPopNums();
                    System.out.println("Get Popped Numbers Successfully");
                    break;
                case 7:
                    stackClass.stackResult(popNums);
                    System.out.println("Display All the Popped Numbers Successfully");
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

