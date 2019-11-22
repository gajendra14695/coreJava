package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityTestJ {
		
		public static void main(String[] args) {
			
			PriorityQueue<Integer>  pq = new PriorityQueue<Integer>();
			pq.add(12);
			pq.add(204);
			pq.add(34);
			pq.add(54);
			pq.offer(1);
			
			//pq.add("hello");
			//pq.add(null);
			System.out.println(pq);
			System.out.println("====================================");
			
			Iterator<Integer> it = pq.iterator();
			while(it.hasNext()) {
				System.out.println(pq.poll());
			}
			System.out.println("After poll "+pq);
		}
}
