package ds.stack;

import java.util.Collections;

/**
 * Created by JitendraSingh on 29/04/18.
 */




/*
* implement stack using array
* stack follow LIFO order(last in first out)
*/
public class ImpStackUsingArray {

    int size;
    private int top;
    private int arr[];
    public ImpStackUsingArray(int size) {

        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }

    /*push element in array*/
    public void push(int element) {

        if (!isStackFull()) {
            arr[++top] = element;
            System.out.println("push element : "+element);
        } else {
            System.out.println("stack is full");
        }

    }

    /*pop element*/
    public int pop() {

        if (!isStackEmpty()) {
            int popElement = top;
            top--;
            System.out.println("pop element : " +arr[popElement]);
            return arr[popElement];
        } else {
            System.out.println("stack is empty");
            return -1;
        }
    }
    public boolean isStackFull() {
        return (size - 1 == top);
    }

    public boolean isStackEmpty() {
        return (top == -1);
    }

    static void testData() {
        ImpStackUsingArray stack = new ImpStackUsingArray(10);
        System.out.println("<==== push element ===>");
        stack.push(2);
        stack.push(4);
        stack.push(9);
        stack.push(5);
        System.out.println("<=== pop element ===>");
        stack.pop();
        stack.pop();
        stack.pop();
    }

    public static void main(String[] args) {
        testData();
    }
}
