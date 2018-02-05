package LinkedList;

class CNode{
	
	int data;
	CNode next;
	
	public CNode(int x){
		this.data=x;
		this.next=null;
	}
}

class CList{
	CNode head;
	CNode onecyclePart;
	CNode startOfLoopPointer;
	
	CList(){
		this.head=null;
	}
	
	public void push(int x) {
		CNode temp = new CNode(x);
		temp.next=this.head;
		this.head=temp;
	}
	//Find the start of the loop
	public void checkCycleStart(CNode temp) {
		
		CNode secondCyclePart = temp;
		
		while(secondCyclePart!=onecyclePart) {
			secondCyclePart=secondCyclePart.next;
			onecyclePart=onecyclePart.next;
		}
		
		System.out.println("Start of Cycle is "+onecyclePart.data);
		System.out.println("Start of Cycle as per pointer two "+secondCyclePart.data);
		startOfLoopPointer=onecyclePart;
	}
	
	//PART III - Eliminate the loop by setting the 'next' pointer 
	//of the last element to null
	public void removeCycle() {
		
		//Here startPtr points to start of the loop
		CNode startPtr= onecyclePart; //
		
		 while(startPtr.next!=onecyclePart) {
			
			 startPtr=startPtr.next;
			 System.out.print(startPtr.data);
		 }
		 startPtr.next=null;
				
	}
	
	
	public boolean checkCycle(CNode temp) {
		
		CNode fast=temp;
		CNode slow=temp;
		
		while(fast!=null&&fast.next!=null) {
		   
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast) {
				this.onecyclePart=slow;
				return true;
			}
	   }
		return false;
	}
	
	
	public void display() {
		
		CNode temp = this.head;
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
	
}

public class CycleLinkedList {
	
	public static void main(String [] args) {
		
		CList l = new CList();
		l.head=new CNode(50);
		l.head.next= new CNode(10);
		l.head.next.next=new CNode(20);
		//l.head.next.next.next=new CNode(40);
		//create a cycle in linked list  //Cycle starts at Node with value 10
		//l.head.next.next.next = l.head.next;
		l.head.next.next.next=l.head;
		//
		//l.display();
		System.out.println(l.checkCycle(l.head));
		
		l.checkCycleStart(l.head);
		l.removeCycle();
		System.out.println();
		l.display();
	}

}
