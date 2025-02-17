package LinkedList;
class dnode{
	int val;
	dnode next;
	dnode prev;
	dnode(int val){
		this.val=val;
	
	}
}

public class ImplementDoubleLinkedList {
	public static void  print(dnode head) {
		dnode temp = head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
	}
	
	public static void  printReverse(dnode tail) {
		dnode temp = tail;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.prev;
		}
	}

	public static void main(String[] args) {
		dnode a= new dnode(10);
		dnode b= new dnode(20);
		dnode c= new dnode(30);
		dnode d= new dnode(40); 
		
		a.next=b; a.prev=null;
		b.next=c; b.prev=a;
		c.next=d; c.prev=b;
		d.prev=c;
		print(a);
		System.out.println();
		printReverse(d);

	}

}
