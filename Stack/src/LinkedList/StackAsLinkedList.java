package LinkedList;

class Node{
	
	int data;
	Node next;
	
	 Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList {
	
	Node top;
	
	public LinkedList() {
		top=null;
	}
	
	public void pushNode(int x) {
		//create top of stack 
		
		//create a new node and fill it 
		Node newNode=new Node(x);
		//set the next pointer of node to top of the list
		newNode.next=top;
		//set the top of the node.
		top=newNode;
	}
	
	public void deleteTopNode() {
		
		Node temp = top;
		top=temp.next;
			
	}
	
	public void display() {
		
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
}

class stack{
	
	private LinkedList listObj;
	
	stack(){
		listObj=new LinkedList();
	}
	
	public void push(int x) {
		
		listObj.pushNode(x);
	}
	
	public void pop() {
		listObj.deleteTopNode();
	}
	
	public void display() {
		listObj.display();
	}
}
public class StackAsLinkedList {
	
	public static void main(String[] args) {
		stack s = new stack();
		s.push(1);
		s.push(2);
		s.display();
		s.pop();
		s.display();
	
	}
		
}
