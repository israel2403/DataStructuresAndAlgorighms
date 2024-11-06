
package queue;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Queue myQueue = new Queue(2);

        myQueue.enqueue(1);

        

        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue());

    }
}