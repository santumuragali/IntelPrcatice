package com.concepets.java;

import java.util.PriorityQueue;

public class PriorityQueueConcept {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq =new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(7);
        pq.add(6);
        pq.add(5);
        pq.add(1);
        System.out.println(pq);
       int nim = pq.remove();
        System.out.println(nim);
    }
}
