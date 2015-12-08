package SoftwareQuality.Tp2;
import java.util.NoSuchElementException;



public class MyQueue {

	  private MyStack stack1;    // back of queue
	    private MyStack stack2;    // front of queue

	    // create an empty queue
	    public MyQueue(int n) {
	        stack1 = new MyStack(n);
	        stack2 = new MyStack(n);
	    }

	    // move all items from stack1 to stack2
	    private void moveStack1ToStack2() {
	        while (!stack1.isEmpty())
	            stack2.push(stack1.pop());
	    }

	    // is the queue empty?
	    public boolean isEmpty() {
	        return stack1.isEmpty() && stack2.isEmpty();
	    }


	    // return the number of items in the queue.
	    public int size() {
	        return stack1.getSize() + stack2.getSize();     
	    }


	    // add the item to the queue
	    public void enqueue(int item) {
	        stack1.push(item);
	    }

	    // remove and return the item on the queue least recently added
	    public int dequeue() {
	        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
	        if (stack2.isEmpty()) moveStack1ToStack2();
	        return stack2.pop();
	    }
	
	
}
