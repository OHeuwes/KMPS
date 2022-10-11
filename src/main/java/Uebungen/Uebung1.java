package Uebungen;

import java.util.Arrays;
import java.util.Stack;
import java.time.Duration;
import java.time.Instant;

public class Uebung1 {
    public static int partition(int[] list, int start, int end) {
        int pivot = list[end];
        int indexOfPivot = start;
        for(int i = start;i<end;i++) {
            if(list[i] <= pivot) {
                int temp = list[i];
                list[i] = list[indexOfPivot];
                list[indexOfPivot] = temp;
                indexOfPivot++;
            }
        }
        int temp = list[indexOfPivot];
        list[indexOfPivot] = list[end];
        list[end] = temp;
        return indexOfPivot;
    }

    public static void quicksort(int[] list) {
        Stack<int[]> stack = new Stack<>();
        int start = 0;
        int end = list.length-1;
        stack.push(new int[]{start, end});
        while(!stack.empty()) {
            start = stack.peek()[0];
            end = stack.peek()[1];
            stack.pop();
            int pivot = partition(list, start, end);

            if(pivot-1>start)
                stack.push(new int[]{start, pivot-1});
            if(pivot+1<end)
                stack.push(new int[]{pivot+1, end});
        }
        System.out.println(Arrays.toString(list));
    }

    static int b = 3;
    public static int differentOutcome(int a) {
        b = b + a;
        return b;
    }

    public static int fibonacciIterativ(int n) {
        Instant start = Instant.now();
        if(n == 0 || n == 1) {
            printTime(start, Instant.now());
            return n;
        }
        else {
            Stack<Integer> stack = new Stack<>();
            stack.push(0);
            stack.push(1);
            for(int i = 1;i<n;i++) {
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                stack.push(a);
                stack.push(a+b);
            }
            printTime(start, Instant.now());
            return stack.peek();
        }
    }

    public static void printTime(Instant start, Instant end) {
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
    }

    public static void main(String[] args) {
        int[] list = {1,6,3,9,45,7,43,45,57,8};
        quicksort(list);
        System.out.println(differentOutcome(3));
        System.out.println(differentOutcome(3));
        System.out.println(fibonacciIterativ(7));
    }
}
