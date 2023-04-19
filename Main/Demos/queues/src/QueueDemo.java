import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {

        Queue<Object> queue = new LinkedList<>();

        System.out.println(queue.add(1));
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println("Size of queue: " + queue.size());
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        //queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());

        System.out.println();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);
        System.out.println("Size of queue: " + queue.size());
        System.out.println(queue.element());
        queue.poll();
        System.out.println(queue.element());
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.poll());
    }
}
