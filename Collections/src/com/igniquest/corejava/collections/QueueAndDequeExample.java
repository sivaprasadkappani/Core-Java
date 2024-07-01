package com.igniquest.corejava.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
 

public class QueueAndDequeExample {
    public static void main(String[] args) {
        // Queue example (FIFO)
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        System.out.println("Queue: " + queue); // [1, 2]
        System.out.println("Poll from Queue: " + queue.poll()); // 1

        // Deque example (both ends)
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addLast(4);
        System.out.println("Deque: " + deque); // [3, 4]
        System.out.println("Remove First from Deque: " + deque.removeFirst()); // 3
    }
}
