import java.util.LinkedList;

public class LinkedListQueueTester {

    public static void main(String[] args) {

        LinkedListQueue queue = new LinkedListQueue();

        //#1
        queue.enqueue("Tom");
        queue.enqueue("Jane");
        queue.enqueue("Beth");
        String string = queue.displayQueue();
        System.out.println(string);

        //#2
        queue.enqueue("John");
        queue.enqueue("Mary");
        String string2 = queue.displayQueue();
        System.out.println(string2);

        //#3
        boolean bool = queue.isEmpty();
        System.out.println("Queue is empty: " + bool);
        int size = queue.size();
        System.out.println("Number of item in queue is " + size);
        Object head = queue.peek();
        System.out.println("The head of the queue is: " + head);
        queue.dequeue();
        System.out.println("Tom has been removed");

        //#4
        System.out.println();
        String string3 = queue.displayQueue();
        System.out.println(string3);

        //#5
        boolean bool2 = queue.isEmpty();
        System.out.println("Queue is empty: " + bool2);
        int size2 = queue.size();
        System.out.println("Number of items in queue is " + size2);
        Object head2 = queue.peek();
        System.out.println("The head of the queue is: " + head2);

        //#6
        System.out.println();
        queue.dequeue();
        System.out.println("Jane has been removed");
        Object head3 = queue.peek();
        System.out.println("The head of the queue is: " + head3);

        //#7
        System.out.println();
        queue.dequeue();
        System.out.println("Beth has been removed");
        Object head4 = queue.peek();
        System.out.println("The head of the queue is: " + head4);

        //#8
        System.out.println();
        queue.dequeue();
        System.out.println("John has been removed");
        Object head5 = queue.peek();
        System.out.println("The head of the queue is: " + head5);

        //#9
        System.out.println();
        queue.dequeue();
        System.out.println("Mary has been removed");
        Object head6 = queue.peek();
        System.out.println("The head of the queue is: " + head6);

        //#10
        System.out.println();
        boolean bool3 = queue.isEmpty();
        System.out.println("Queue is empty: " + bool3);



    }

}
