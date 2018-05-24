package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

class BTreeNode{
	
	int data;
	BTreeNode left;
	BTreeNode right;
	
	BTreeNode(int x){
		this.data=x;
		this.left=this.right=null;
	}
}

class BTreeOps{
	
	BTreeNode root;
	
	public TreeMap<Integer,ArrayList>ht = new TreeMap<>();
	public ArrayList<Integer>a1;
	int countLeafNodes=0;
	
	BTreeOps(){
		this.root=null;
	}
	
	private void setcountLeafNode() {
		countLeafNodes=countLeafNodes+1;
	}
	
	public int getLeafNodesCount() {
		return countLeafNodes;
	}
	
	public void preOrder(BTreeNode root) {
		
		if(root!=null) {
			System.out.print(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void postOrder(BTreeNode root) {
		
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data);
		}
	}
	
	public void inOrder(BTreeNode root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data);
			inOrder(root.right);
		}
	}
	
	
	public void dfs(BTreeNode root) {
		
		//this is same as preorder traversal
		if(root!=null) {
			System.out.print(root.data);
			dfs(root.left);
			dfs(root.right);
		}
	}
	
	public void bfs(BTreeNode root) {
		
		Queue <BTreeNode> queue  = new LinkedList();
		// enqueue 
		queue.add(root);
		while(!queue.isEmpty()) {
		BTreeNode node = queue.remove();
		System.out.print(node.data);
		 if(node.left!=null) {
			 queue.add(node.left);
		 }
		 if(node.right!=null) {
			 queue.add(node.right);
		 }
		}
		
		
		
	}
	
	public void bfsPrintLevel(BTreeNode root) {
		
		Queue<BTreeNode> queue = new LinkedList();
		
		queue.add(root);
	
		while(true) {  
			
			// dequeue 
			int nodeCount = queue.size(); //get the queue size
			
			if(nodeCount==0)  // if node count ==0 break 
				break;
			
			while(nodeCount > 0) {  //node count is > 0
			BTreeNode temp = queue.remove();
			System.out.println(temp.data);  // print the data
			if(temp.left!=null) {
		    queue.add(temp.left);
			}
			if(temp.right!=null) {
			queue.add(temp.right);
			}
			nodeCount--; // reduce the nodecount  irrespective of node being queued or not
			}
		}
		
	}
	
	public BTreeNode verticalOrderTraversal(BTreeNode root,int level) {
		
		if(root==null) {
			return null;
		}
		if(ht.get(level)!=null) {
			ArrayList x = ht.get(level);
			x.add(root.data);
			ht.put(level, x);
		}
		else {
			a1 = new ArrayList<Integer>();
			a1.add(root.data);
			ht.put(level,a1);
		}
		
		BTreeNode y = verticalOrderTraversal(root.left, level-1);
		if(y==null) {
			level++;
		}
		return verticalOrderTraversal(root.right, level+1);
		
	}
	
	public void printVerticalOrderTraversalResult() {
		
		Set<Integer>s = ht.keySet();
		for(int keys:s) {
			System.out.println(ht.get(keys));
		}
		
	}
	
	public List<Integer> printLHS(BTreeNode root){
		
		ArrayList<Integer>result = new ArrayList<Integer>();
		LinkedList<BTreeNode> queue = new LinkedList<BTreeNode>();
		
		if(root== null) return result;
		
		queue.add(root);
		while(queue.size()>0) {
			
		   int size= queue.size();
		   
		   for(int i=0;i<size;i++) {
			   BTreeNode top= queue.remove();
			   if(i==0) {
				   result.add(top.data);
			   }
			   if(top.left!=null) {
				   queue.add(top.left);
			   }
			   if(top.right!=null) {
				   queue.add(top.right);
			   }
		   }
		}
		
		return result;
		
	}
	public List<Integer> printRHS(BTreeNode root) {
		
		ArrayList<Integer>result = new ArrayList<Integer>();	//store the result in arraylist	
		LinkedList<BTreeNode>queue = new LinkedList<BTreeNode>();
		
		if(root==null) return result;
		
		queue.add(root);
		while(queue.size() >0 ) {
			// remove the top node
			
			int size= queue.size();
			for(int i=0;i<size;i++) {
				
				BTreeNode top = queue.remove();
				// add to result array for right side node if i==0;
				if(i==0) {
					result.add(top.data);
				}
				// push the right node 
				if(top.right!=null) {
					queue.add(top.right);
				}
				
				if(top.left!=null) {
					queue.add(top.left);
				}
			}
		}
		return result;
	}
	
	
	public void printkthNodes(BTreeNode node,int level) {
		
		if(node==null)
			return;
		
		if(level==0) {
			System.out.print(node.data);
			return;
		}
		else {
		printkthNodes(node.left,level-1);
		printkthNodes(node.right,level-1);
		}
	}
	
	public boolean checkIfTreeMirror(BTreeNode tree1Root,BTreeNode tree2Root) {
		
		if(tree1Root==null && tree2Root==null)
			return true;
		if(tree1Root==null || tree2Root==null)
			return false;
		if(tree1Root.data==tree2Root.data) {
			
			if( (checkIfTreeMirror(tree1Root.left,tree1Root.right)) && (checkIfTreeMirror(tree1Root.right,tree2Root.left))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkAncestor(BTreeNode root,BTreeNode target) {
		
		if(root!=null) {
			
			if(root.data==target.data)
				return true;
			
			if((checkAncestor(root.left,target))||(checkAncestor(root.right,target))) {
				System.out.print(root.data);
				return true;
			}
				
			
		}
		return false;
	}
	
	public void countleafNodes(BTreeNode root) {
		if(root!=null) {
			
			if(root.left==null && root.right==null) {
				setcountLeafNode(); // access and increment a state
			} 
			if(root.left!=null)
				countleafNodes(root.left);
			if(root.right!=null)
				countleafNodes(root.right);
		}
	}
	
	
	public int addNodes(BTreeNode root) {
		
		if(root==null)
			return 0;
		
		int sum = root.data+addNodes(root.left)+addNodes(root.right);
		
		return sum ;
		
	}
	
	
	public BTreeNode mirrorTree(BTreeNode root) {
		
		if(root!=null) {
			mirrorTree(root.left); //1. mirror left subtree
			mirrorTree(root.right); //2. mirror right subtree
			BTreeNode temp = root.left;  // 3.swap 
			root.left=root.right;
			root.right=temp;		
		}
		return root ;
	}
	
	public int checkSumTree(BTreeNode root) {
		
		 int leftData=0;
		 int rightData=0;
		 
		 if(root==null || root.left==null ||root.right==null)
			 return 1;
		 else {
			 
			 if(root.left!=null)
				 leftData=root.left.data;
			 if(root.right!=null)
				 rightData=root.right.data;
			 
			 if((root.data==leftData+rightData) && checkSumTree(root.left)!=0 &&checkSumTree(root.right)!=0)
				 return 1;
			 else
				 return 0;
			 
			 }
	
		 }
		
		
	
  public void printRootToLeaf(BTreeNode root,String s) {
	   // this is like preorder traversal
	  if(root==null)
		  return;
	  s=s + root.data;
	  if(root.left==null && root.right==null) {
		  System.out.print(s);
		  System.out.println();
	  }	
	  printRootToLeaf(root.left,s);
	  printRootToLeaf(root.right,s);
	  
	  
  }
  
  
  public int diameter(BTreeNode root) {
	  
	  if(root==null)
		  return 0;
	  
	  int leftHeight= findBTreeHeight(root.left);
	  int rightHeight = findBTreeHeight(root.right);
	  int leftDiameter = diameter(root.left);
	  int rightDiameter = diameter(root.right);
	  
	  int fd = Integer.max(leftHeight+rightHeight+1, Integer.max(leftDiameter, rightDiameter));
	  
	  return fd;
  }
  
  public int findBTreeHeight(BTreeNode root) {
	  
	  if(root==null)
		  return 0 ;
	 
	  int leftHeight= findBTreeHeight(root.left);
	  int rightHeight = findBTreeHeight(root.right);
	  
	  if(leftHeight > rightHeight) {
		  return (1+leftHeight);
	  }
	  else {
		  return (1+rightHeight);
	  }
  }

	
	public void constructBTree(int[] array) {
		
		root=new BTreeNode(array[0]); //set the root node;
		
		for(int i= 1;i<array.length;i++) {
			
			BTreeNode temp = new BTreeNode(array[i]);
			BTreeNode p= root;
		    while(true) {
			//check if temp.data is less than root.data then insert into left node
			if(temp.data<=p.data) {
				
				if(p.left==null) {
					p.left=temp;
					break; // break from while loop and go to next node in the array
				}
				p=p.left;
			}
			// if temp data is greater than right data insert into right node. 
			else if(temp.data>=p.data) {
				if(p.right==null) {
					p.right=temp;
					break;
				}
				p=p.right;
			}
		    }
		}
	}
}
public class Btree {
	
	public static void main(String[] args) {
		int array[]={ 1, 2, 3, 4, 5, 6, 6, 6, 6 };
		BTreeOps tree = new BTreeOps();
		tree.constructBTree(array);
		System.out.print("Inorder Traversal ");
		tree.inOrder(tree.root);
		System.out.println();
		System.out.print("PreOrder Traversal ");
		tree.preOrder(tree.root);
		System.out.println();
		System.out.print("Post Order Traversal ");		
		tree.postOrder(tree.root);
		System.out.println();
		System.out.print("DFS  Traversal ");		
		tree.dfs(tree.root);
		System.out.println();
		System.out.print("BFS  Traversal ");
		tree.bfs(tree.root);
		System.out.println();
		System.out.print("Print Nodes at 3rd level ");
		tree.printkthNodes(tree.root,3);
		System.out.println();
		System.out.print("The Ancestor of node at 3rd level are ");
		tree.checkAncestor(tree.root, tree.root.right.right.right);
		System.out.println();
		tree.countleafNodes(tree.root);
		System.out.print("The count of leaf nodes is "+tree.getLeafNodesCount());
		System.out.println();
		System.out.println("Sum of nodes is "+tree.addNodes(tree.root));
		System.out.println();
		BTreeNode mirror = tree.mirrorTree(tree.root);
		System.out.print("Mirror ");
		tree.inOrder(mirror);
		System.out.println();
		System.out.print("Paths from Root to leaf nodes ");
		tree.printRootToLeaf(tree.root, "");
		System.out.println();
		System.out.print("Height of the tree is " +tree.findBTreeHeight(tree.root));
		System.out.println();
		System.out.println("Tree printed Level wise using BFS is ");
		tree.bfsPrintLevel(tree.root);
		System.out.println();
		System.out.println("Diameter of tree is  "+tree.diameter(tree.root));
		System.out.println();
		System.out.println("Vertical Order Traversal with TreeMap");
		tree.verticalOrderTraversal(tree.root, 0);
		tree.printVerticalOrderTraversalResult();
		System.out.println("RHS view of the tree is ");
		List<Integer> rhs= tree.printRHS(tree.root);
		
		for(int i=0;i<rhs.size();i++) {
			System.out.println(rhs.get(i));
		}
		
		System.out.println("LHS view of the tree is ");
		List<Integer> lhs= tree.printRHS(tree.root);
		
		for(int i=0;i<lhs.size();i++) {
			System.out.println(lhs.get(i));
		}
	}

}
