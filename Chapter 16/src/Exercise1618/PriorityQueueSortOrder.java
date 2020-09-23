package Exercise1618;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueSortOrder {

	public static void main(String[] args) {
		PriorityQueue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());
		
		queue.offer(32.1);
		queue.offer(42.1);
		queue.offer(52.1);
		queue.offer(62.1);
		queue.offer(22.1);
		
		while(queue.size() > 0) {
			System.out.printf("%.1f ", queue.poll() , queue.peek());
	}

	}
}
