package LinkedList;

class LNode{
	
	int data; 
	LNode next;
	public LNode (int data){
		this.data=data;
		this.next=null;
	}
}


class LList{
	
	LNode head;
	int carry;
	public LList() {
		head=null;
	}
	
	public  void push(int x) {
		
		LNode temp = new LNode(x);
		temp.next=this.head;
		this.head=temp;
	}
	
	public void reverse() {
		
		LNode previous=null;
		LNode nextNode=null;
		LNode current =this.head;
  // reverse needs three pointers 
  //current previous and next 
		while(current!=null) {
			//assign the nextNode from current->next pointer
			 nextNode=current.next;
			 current.next=previous;
			 previous=current;
			 current=nextNode;
		}
		this.head=previous;
		
	}
	public void display() {
		
		LNode temp=this.head;
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
	
	public int getSizeList(LList l) {
		int size=0;
		LNode temp = l.head;
		while(temp!=null) {
			size=size+1;
			temp=temp.next;
		}
		return size;
	}
	
	public void addSameSize(LNode n,LNode m) {
				
		if(n==null) {
			return;
		}
		addSameSize(n.next, m.next);		
		int sum = n.data+m.data+carry;
		carry=sum/10;
		sum=sum%10;
		System.out.print(sum);
	}
	public  void addListSameSize(LList l,LList m) {
		
		LNode temp1=l.head;
		LNode temp2= m.head;
		addSameSize(temp1, temp2);
		
	}
}


public class ReverseLinkedList {
	
	public static void main(String[] args) {
		
		LList l = new LList();
		LList m = new LList();
		l.push(8);
		l.push(9);
		//l.display();
		m.push(0);
		m.push(2);
		 m.addListSameSize(l,m);
	
	}

}
