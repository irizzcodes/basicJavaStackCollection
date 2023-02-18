package com.company;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Random;

public class StackClass {
    final Stack<Integer>stackList;
    final ArrayList<Integer>popNums;
    final ArrayList<Integer>randomList;
    static Random rand = new Random();

    public StackClass() {
        stackList = new Stack<>();
        popNums = new ArrayList<>();
        randomList = new ArrayList<>();
    }

    public void stackAdd(ArrayList<Integer> num) {
        for(int values : num ) {
            stackList.push(values);
        }
        System.out.println("Successfully Push elements from Arraylist");
    }

    public void stackResult(ArrayList<Integer> num) {
        for(int values : num) {
            System.out.println(values);
        }
    }

    public void stackPop() {
        int pop = stackList.pop();
        popNums.add(pop);
        System.out.println("Pop: " + pop);
    }
    public void generateRandom() {
        for(int i=0;i<11;i++) {
            randomList.add(rand.nextInt(101));
        }
    }

    public void emptyRandom() {
        randomList.clear();
    }

    public ArrayList<Integer> getPopNums() {
        return popNums;
    }

    public ArrayList<Integer> getRandomList() {
        return randomList;
    }

}

