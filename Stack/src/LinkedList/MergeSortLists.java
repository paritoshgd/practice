package LinkedList;


class MENode{
	
	int data;
	MENode next;
	
	MENode(int x){
		this.data=x;
		this.next=null;
	}
	
	MENode(){}
}

class MEList{
	
	MENode head;
	
	MEList(){
		this.head=null;
	}
	
	public void push(int data) {
		
		MENode temp = new MENode(data);
		temp.next=this.head;
		this.head=null;
	}
	
	public void display(MENode node) {
		
		while(node!=null) {
			if(node==null) {
				System.out.print("NULL");
			}
			System.out.print(node.data+"->");
			node=node.next;
			
		}
	}
	
	public MENode mergeLists(MENode p,MENode q) {
		
		if(p==null)return q;
		if(q==null)return p;
		
		// find which of p or q is the first smallest and assign SortNode
		MENode sorted= new MENode();
		
		if(p.data <= q.data) {
			sorted=p;
			p=sorted.next;
		}
		
		else {
			sorted=q;
			q=sorted.next;
		}
		
		// assign the new_head which is head of the new linked list to the sorting_pointer
		MENode new_head=sorted; // this is to be returned to return the pointer to the sorted linked list
		
		while(true) {
			
			if(p.data<=q.data) {
				sorted.next=p;
				sorted=p;
				p=sorted.next;
			}
			else {
				sorted.next=q;
				sorted=q;
				q=sorted.next;
			}
			
			if(p==null) {
				sorted.next=q;
				break;
			}
			if(q==null) {
				sorted.next=p;
				break;
			}
			
		}		
		
		
		return new_head;
	}
}
public class MergeSortLists {
	
public static void main(String[] args) {
	
	MEList l1=  new MEList();
	l1.head = new MENode(1);
	l1.head.next= new MENode(3);
	
	MEList l2= new MEList();
	l2.head = new MENode(2);
	l2.head.next= new MENode(4);
	
	MENode s = l1.mergeLists(l1.head, l2.head);
	
	l1.display(s);
}

}
