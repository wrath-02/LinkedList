package LinkedList;

/*same package mein baar baar same defined nhi krna*/
/*class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}*/
public class Printing {
		//public static void print(Node head) {
			//Node temp = head;
			//while(temp!=null) {
				//System.out.println(temp.val);
			//	temp=temp.next;
			//}
	//	}
	
	//Recursively print
	
	/*method 1
	 * public static void print(Node head) { Node temp = head; if(temp!=null) {
	 * System.out.println(temp.val); } else { return; }
	 * 
	 * print(temp.next); }
	 */
	
	//Method 2
//	public static void print(Node head) {
//		if(head==null) return;
//		System.out.println(head.val);
//		print(head.next);
//	}
	//reverse order
	public static void print(Node head) {
		if(head==null) return;
		print(head.next);
		System.out.println(head.val);
		
	}
	
	public static void main(String []args) {
		Node a =new Node(10);
		
		//Node temp =new Node(10)   Deep copy
		
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		
	//Linking
		
		a.next = b ;  //10->20
		b.next = c ;  //10->20->30
		c.next = d ;  //10->20->30->40
		d.next = e ;  //10->20->30->40->50
		Node temp =a;  //Shallow copy
		
		print(a);
		
	}
}
