package Day9.Challenge4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();

//Adding elements to the Queue
        q.add("Ismail");
        q.add("Kamal");
        q.add("Rachid");
        // Affichage
        System.out.println("Elements in Queue:"+q);
        //remove the element from the front of the queue
        System.out.println("Removed element: "+q.remove());
// Affichage
        System.out.println("Elements in Queue:"+q);
//get the element at the front of the queue without removing it
        System.out.println("Head: "+q.peek());
//Check if the queue is empty.

        System.out.println("Is the queue empty? " + q.isEmpty());






    }

}
