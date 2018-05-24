package LinkedList;

class OENode{
	
	int data;
	OENode next;
	
	OENode(int x){
		this.data=x;
		this.next=null;
	}
}
class OEList{
	
	OENode head;
	
	OEList(){
		this.head=null;
	}
	
	public void push(int x) {
		OENode temp = new OENode(x);
		temp.next=this.head;
		this.head=temp;
	}
	
	public void display(OENode temp) {
		
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}

	public void findNthNodeFromEnd(OENode node,int nodePostion) {
		
		OENode slow= node;
		OENode fast = node;
		int count=1;
		while(count<=nodePostion-1) {
			fast=fast.next;
			count++;
		}
		while(fast.next!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		
		System.out.println(slow.data);
		
	}
	
	
	public OENode rotateList(OENode nodeToRotate) {
		
		OENode p = this.head;
		
		while(p!=null) {
			
			if(p==nodeToRotate) {
				break;
			}
			p=p.next;
		}
		
		OENode newHead=p.next; // the nodeToRotate will be the newHead
		p.next=null; // this is the last node of the new linked list
		
		OENode q = newHead;
		while(q.next!=null) {
			q=q.next;
		}
		q.next=this.head;
		
		return newHead;
	}
	
   public void checkOddorEven(OENode head) {
	   
	   OENode p = head;
	   
	   while(true) {
		   
		   if(p==null) {
			   System.out.println("Even list");
			   break;
		   }
		   
		   if(p.next==null) {
			   System.out.println("Odd list");
			   break;
		   }
		   
		   p=p.next.next;  // jump two nodes
		   
	   }
   }
}
public class OddEvenLength {

	public static void main(String args[]) {
		
		OEList oddList= new OEList();
		oddList.head= new OENode(1);
		oddList.head.next = new OENode(2);
		oddList.head.next.next= new OENode(3);
		oddList.checkOddorEven(oddList.head);
		
		OEList evenList= new OEList();
		evenList.head= new OENode(1);
		evenList.head.next = new OENode(2);
		evenList.head.next.next= new OENode(3);
		evenList.head.next.next.next= new OENode(4);
		evenList.checkOddorEven(evenList.head);
		evenList.findNthNodeFromEnd(evenList.head,2);
		OENode m = evenList.rotateList(evenList.head.next);
		evenList.display(m);
		
	}
}
