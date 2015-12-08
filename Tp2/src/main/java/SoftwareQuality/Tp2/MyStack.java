package SoftwareQuality.Tp2;

public class MyStack {

	 private int top;
	    int size;
	    private int[] stack ;

	    public MyStack(int arraySize){
	        size=arraySize;
	        setStack(new int[size]);
	        top=-1;
	    }

	    public void push(int value)throws IllegalStateException
	    {
	        if(top==size-1){
	           // System.out.println("Stack is full, can't push a value");
	        	throw new IllegalStateException("Stack is full, can't push a value");
	        }
	        else{

	            top=top+1;
	            getStack()[top]=value;
	        }
	    }

	    public int pop()throws IllegalStateException
	    {
	        if(!isEmpty())
	        { 
	        	int previousTop=getStack()[top];
	        	getStack()[top]=0; 
	        	top=top-1;
	        	return previousTop;
	        }
	        
	        else{
	        	//throw exception
	            //System.out.println("Can't pop...stack is empty");
	            throw new IllegalStateException("Can't pop...stack is empty");
	           // return 0;
	        }
	    }
	    
	    public int head()throws IllegalStateException
	    {
	    	if(top!=-1)
	    	return stack[top];
	    	else
	    		throw new IllegalStateException("Can't return head, stack is empty...");
	    	
	    }
	    public boolean isEmpty(){
	        return top==-1;
	    }
	    
	    public boolean isFull()
	    {
	    	return top==size-1;
	    }

	    public void display(){

	        for(int i=0;i<=top;i++){
	            System.out.print(getStack()[i]+ " ");
	        }
	        System.out.println();
	    }

		int[] getStack() {
			return stack;
		}

		void setStack(int[] stack) {
			if (stack.length > size){
				throw new IllegalStateException("can't set stack, too big");
			}
			this.stack = stack;
			top=stack.length -1;
							}
	
		public int getSize()
		{
			return size;
		}
		
		public int getNumberOfElements()
		{
			
			return top+1;
		}
	
	
	
}
