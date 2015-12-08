package SoftwareQuality.Tp2;
import junit.framework.*;

public class MyStackTest extends TestCase{

	protected MyStack stack;
	protected int size;
	
	protected void setUp(){
		size=3;
		stack = new MyStack(size);
	}
	
	public void testIsEmpty(){
		assertTrue(stack.isEmpty());
	}
	
	public void testIsFull(){
		stack.push(1);
		stack.push(1);
		stack.push(1);
		assertTrue(stack.isFull());
	}
	
	public void testGetNbrOfElmts(){
		assertTrue(stack.getNumberOfElements()==0 );
		stack.push(1);
		assertTrue(stack.getNumberOfElements()==1);
		
	}
	
	 public void testPushNotFull(){
		 int startsize = stack.getNumberOfElements();
		 stack.push(1);
		 int endSize =stack.getNumberOfElements();
		 assertTrue(endSize - startsize ==1);
	}
	
	
	 public void testPushFull(){
		stack.push(1);
		stack.push(3);
		stack.push(2);
		assertTrue(stack.isFull());
		try{
			stack.push(2);
		}catch(IllegalStateException ex){
			assertTrue(ex.getMessage().equals(" stack full, can't push"));
			}
	}
	
	public void testPopOnNotEmpty(){
		stack.push(1);
		assertTrue(!stack.isEmpty());
		try{
			int startSize = stack.getNumberOfElements();
			stack.pop();
			int endSize =stack.getNumberOfElements();
			assertTrue(startSize - endSize == 1);	
		}catch(Exception ex){
			   }
	}
	
	public void testPopOnEmpty(){
		assertTrue(stack.isEmpty());
		try{
			stack.pop();
		}catch(IllegalStateException ex ){
			assertTrue(ex.getMessage().equals(" stack empty, can't pop"));
		}
	}
	
	public void testgetStack(){
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		int[] finalStack = stack.getStack();
		int[] expectedStack = new int[]{1 ,2 ,3 };
		
		for(int i=0; i<3; i++){
			assertTrue(finalStack[i] == expectedStack[i]);
		}
	}
	
	/*public void testSetStack(){
		stack.setStack(new int[]{3, 2, 1});
		stack.pop();
		stack.pop();
		assertTrue (stack.getStack().length == 1 && stack.getStack()[0] == 3);
	}
	
	*/
	
	public void testSetStackToBig(){
		
		int[] stack2 = {1, 2, 3};
		try{
			stack.setStack(stack2);
		}catch(IllegalStateException ex ){
			assertTrue(ex.getMessage().equals(" stack to big"));
		}
				
	}
	
	public void testSetStackNotToBig(){
		int[] Stack1 = {1,2,3};
		stack.setStack(Stack1);
		stack.pop();
		stack.pop();
		assertTrue(stack.getStack()[0] == 1 && stack.getStack()[1] == 0 && stack.getStack()[2] == 0);
	}
	
	
}
