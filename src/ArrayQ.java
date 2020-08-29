public class ArrayQ

{
   int front, rear, size;
   int capacity;
   int array[];

   public ArrayQ(int capacity) {
       this.capacity = capacity;
       front = this.size = 0;
       rear = capacity - 1;
       array = new int[this.capacity];
   }

   boolean isFull()

   { 
	   return (size == capacity);
   }

   boolean isEmpty()
   { 
	   return (size == 0); 
	   }

   int enqueue( int item)
   {
       if (isFull())
           return -1;
       this.rear = (this.rear + 1)%this.capacity;
       this.array[this.rear] = item;
       this.size = this.size + 1;
       return item;
   }

   int dequeue()

   {
      if (isEmpty())
           return Integer.MIN_VALUE;
       int item = this.array[this.front];
       this.front = (this.front + 1)%this.capacity;
       this.size = this.size - 1;
       return item;
   }
//Split the front and rear
   int front()
   {
       if (isEmpty())
           return Integer.MIN_VALUE;
       return this.array[this.front];
   }
   int rear()
   {
       if (isEmpty())
           return Integer.MIN_VALUE;
       return this.array[this.rear];
   }

   public static void main(String args[]) throws Exception {
       ArrayQ queue = new ArrayQ(20);

       System.out.println("Number enqueue onto stack: " +"[" + queue.enqueue(1)+"]");
       System.out.println("Number enqueue onto stack: " +"[" +queue.enqueue(7)+"]");
       System.out.println("Number enqueue onto stack: " +"[" +queue.enqueue(3)+"]");
       System.out.println("Number enqueue onto stack: " +"[" +queue.enqueue(4)+"]");
       System.out.println("Number enqueue onto stack: " +"[" +queue.enqueue(9)+"]");
       System.out.println("Number enqueue onto stack: " +"[" +queue.enqueue(2)+"]");
       System.out.println(queue.dequeue());
       System.out.println(queue.dequeue());
       System.out.println(queue.dequeue());
       System.out.println(queue.dequeue());
       System.out.println(queue.dequeue());
   }
   }