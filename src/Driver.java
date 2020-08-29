import javax.naming.LinkLoopException;

public class Driver{

      public static void main(String args[]) throws LinkLoopException {
    	       ArrayStack stack = new ArrayStack();
    	       stack.push(1);
    	       stack.push(7);
    	       stack.push(3);
    	       stack.push(4);
    	       stack.push(9);
    	       stack.push(2);
    	     

    	       LinkedStack stack1 = new LinkedStack();
    	       stack1.push(1);
    	       stack1.push(7);
    	       stack1.push(3);
    	       stack1.push(4);
    	       stack1.push(9);
    	       stack1.push(2);
    	       
    	   }

    	}
