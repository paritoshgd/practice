
public class StackExample {
	
	 int [] array;
	 int top;
	 int maxSize;
	 
	 public StackExample() {
		 
		 top=-1;
		 maxSize=4;
		 array=new int[maxSize];
	 }
	 
	 public void push(int i) {
		 
		 array[++top]=i;
	 }
	
	 public int pop() {
		 
		 return array[top--];
	 }
	 
	 public boolean checkStackFull() {
		 
		 return (top == maxSize-1);
		 
	 }
	 public boolean checkStackEmpty() {
		 return (top==-1);
		 
	 }
	 
	 public static void main(String[] args) {
		 
		 StackExample s = new StackExample();
		 s.push(1);
		 s.push(2);
		 s.push(3);
		 s.push(4);
		 
		 System.out.println("Stack is full .. ?"+s.checkStackFull());
		 
		for(int i=0; i <s.maxSize ;i++) {
			
			System.out.println(s.pop());
			
		}
		System.out.println("Value of top "+s.top);
		System.out.println("Stack is empty " +s.checkStackEmpty());
	 }
}
