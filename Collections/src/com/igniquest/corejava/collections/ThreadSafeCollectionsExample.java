package com.igniquest.corejava.collections;

import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.concurrent.*;

public class ThreadSafeCollectionsExample {
    public static void main(String[] args) {
        // ConcurrentHashMap example
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("one", 1);
        concurrentMap.put("two", 2);

        // CopyOnWriteArrayList example
        List<Integer> copyOnWriteList = new CopyOnWriteArrayList<>();
        copyOnWriteList.add(3);
        copyOnWriteList.add(4);

        // ConcurrentLinkedQueue example
        Queue<Integer> concurrentQueue = new ConcurrentLinkedQueue<>();
        concurrentQueue.offer(5);
        concurrentQueue.offer(6);

        // ConcurrentSkipListSet example
        NavigableSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        concurrentSkipListSet.add(7);
        concurrentSkipListSet.add(8);

        System.out.println("ConcurrentMap: " + concurrentMap);
        System.out.println("CopyOnWriteList: " + copyOnWriteList);
        System.out.println("ConcurrentQueue: " + concurrentQueue);
        System.out.println("ConcurrentSkipListSet: " + concurrentSkipListSet);
    }
}
