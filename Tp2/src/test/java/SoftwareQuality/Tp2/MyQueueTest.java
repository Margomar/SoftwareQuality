package SoftwareQuality.Tp2;

import SoftwareQuality.Tp2.MyQueue;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



public class MyQueueTest extends TestCase{

	protected MyQueue queue;
	protected int size =3;

	protected void setUp(){
		queue = new MyQueue(size);		
	}
	
	public void testIsEmpty(){
		junit.framework.Assert.assertTrue(queue.isEmpty());
	}

	
	
	
	
	
	
}
