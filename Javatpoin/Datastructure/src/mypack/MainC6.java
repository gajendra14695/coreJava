package mypack;
import java.util.PriorityQueue;
public class MainC6 {
	public static void main(String[] args) {
		PriorityQueue pq= new PriorityQueue();
		pq.add("P");
		pq.add("Q");
		System.out.println(pq);
		pq.offer("R");
		pq.offer("O");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		pq.offer("null");
		System.out.println(pq);
		//pq.offer(NULL);
		
	}

}
