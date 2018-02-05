package LinkedList;

class QNode{
	
	int data;
	QNode next;
	
	QNode(int data){
		this.data=data;
		this.next=next;
	}
}

class Queue{
	
	QNode front,rear;
	
	public Queue(){
		this.front=null;
		this.rear=null;
	}
	public void enqueue(int x) {
		
		//if rear is null node is yet to be inserted and front and rear will point to the same node
		QNode temp = new QNode(x);
		if(this.rear==null) {
			this.front=this.rear=temp;			
		}
		
		this.rear.next=temp;
		rear=temp;
	}
	public QNode dequeue() {
		
		// // If queue is empty, return NULL.
		if(this.front==null) {
			return null;
		}
		// Store in temp the first node
		QNode temp = this.front;
		front= front.next;
		 // If front becomes NULL, then change rear also as NULL
		
		 if(this.front==null)
			 this.rear=null;
		 return temp;
	   
	}
	
	public void display() {
		QNode temp = this.front;
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
}
public class QueueAsLinkedList {
	
	public static void main(String[] args) {
		
		 Queue q=new Queue();
	        q.enqueue(10);
	        q.enqueue(20);
	        q.display();
	        q.dequeue();
	        q.dequeue();
	        q.display();
	        q.enqueue(30);
	        q.enqueue(40);
	        q.display();
	
	        q.enqueue(50);
	    
	        q.display();
	       // System.out.println("Done");
	      // System.out.println("Dequeued item is "+ q.dequeue().data);
	}
	
}
