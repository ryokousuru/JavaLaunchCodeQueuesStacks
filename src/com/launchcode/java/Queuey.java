package com.launchcode.java;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Queuey {

    LinkedList queue;
    LinkedList queue2;
    //using the constructor to make a queue instance
    public Queuey(){
        queue = new LinkedList();
        queue2 = new LinkedList();
    }

    //is anything in the queue?
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public boolean isEmpty2(){
        return queue2.isEmpty();
    }

    //how big is the queue?
    public int size(){
        return queue.size();
    }
    public int size2(){
        return queue2.size();
    }
    //add an item to the last position
    public void enqueue(int numb){
        queue.addLast(numb);
    }

    public void enqueue2(String num){
        queue2.addLast(num);
    }
    //removing an item from the first position
    public int dequeue(){
        return (int) queue.remove(0);
    }
    public String dequeue2(){
        return (String) queue2.remove(0);
    }

    //take a peak at first item
    public int peekaboo(){
        return (int) queue.get(0);
    }
    public String peekaboo2(){
        return (String) queue2.get(0);
    }

    public static void integerExample(){
        Queuey numberq = new Queuey();
        System.out.println("Right now the contents of the string is " + numberq.isEmpty());
        numberq.enqueue(4);
        numberq.enqueue(9);
        numberq.enqueue(2);
        numberq.enqueue(8);
        System.out.println("First one out is " + numberq.dequeue());
        System.out.println("Check out the next item, it is " + numberq.peekaboo());
        System.out.println("Next one out is " + numberq.dequeue());
        System.out.println("After that, " + numberq.dequeue() + " got out.");
        System.out.println("Last one out is " + numberq.dequeue());
        System.out.println("The size of the queue is " + numberq.size());
        System.out.println("The contents of the string is " + numberq.isEmpty());
    }

    public static void stringExample(){
        Queuey stringQue = new Queuey();
        stringQue.enqueue2("What's");
        stringQue.enqueue2("happening");
        System.out.print(stringQue.dequeue2() + " ");
        System.out.print(stringQue.dequeue2() + "?");
    }
    public static void stackExample(){
        Stack<String> up = new Stack();
        up.push("happening");
        up.push("What's");
        System.out.println("The interrogative pronoun is at position " + up.search("What's"));
        System.out.println("The size of it is " + up.size());
        System.out.println("Sneaking a peek: " + up.peek());
        System.out.print(up.pop() + " ");
        System.out.println(up.pop() + "?");
        System.out.println("Now the size of it is " + up.size());
    }



    public static void main(String[] args) {
	// write your code here
        //integerExample();
        //stringExample();
        stackExample();


    }
}
