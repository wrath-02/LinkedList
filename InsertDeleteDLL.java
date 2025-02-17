package LinkedList;
class dnode{
	int val;
	dnode next;
	dnode prev;
	dnode(int val){
		this.val=val;
	}
}
class DLL{
	dnode head;
	dnode tail;
	int size;
	void display() {
		dnode temp =head;
		while(temp!=null) {
			System.out.println(temp.val+" ");
			temp= temp.next;
		}
		System.out.println();
	}
	void insertAtTail(int val) {
		dnode temp =new dnode(val);
		if(size==0) {
			head=tail=temp;
		}
		else {
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
		size++;
	}
	void insertAtHead(int val) {
		dnode temp =new dnode(val);
		if(size==0) {
			head=tail=temp;
		}
		else {
			temp.next=head;
			head.prev=temp;
			head=temp;
		}
		size++;
	}
	
    void insertAtanyIndex(int idx,int val) {
    	
   	 	if(idx==0) {
   	 		insertAtHead(val);
   	 	}
   	 	if(idx==size) {
   	 		insertAtTail(val);
   	 	}
   	 	if(idx>size ||idx<0) {
   	 		System.out.println("Index Out of Bound");
   	 	}
   	 	
   	 	dnode temp = new dnode(val);
   	 	dnode x =head;
   	 	for(int i =0;i<idx-1;i++) {
   	 		x=x.next;
   	 	}
   	 	dnode y =x.next;
   	 	x.next = temp;
   	 	temp.prev=x;
   	 	y.prev=temp;
   	 	temp.next=y;
   	 	size++;
    }
    
    void deleteAtHead() throws Error {
    	if(size==0) throw new Error("List is Empty");
    	head=head.next;
    	head.prev=null;
    	size--;
    }
    
    void deleteAtTail() throws Error {
    	if(size==0) throw new Error("List is Empty");
    	tail=tail.prev;
    	tail.next=null;
    	size--;
    }
    
    void deleteAtanyIndex(int idx) throws Error {
    	
   	 	if(idx==0) {
   	 		deleteAtHead();

   	 	}
   	 	if(idx==size-1) {
	 		deleteAtTail();
	 	}
   	 	if(idx>=size || idx<0) {
   	 		throw new Error("Invalid Index");
   	 	}
   	 	dnode temp = head;
   	 	for(int i =0;i<idx-1;i++) {
   	 		temp=temp.next;
   	 	}
   	 	temp.next=temp.next.next;
   	 	temp=temp.next;
   	 	temp.prev=temp.prev.prev;
   	 	size--;
    }
}
public class InsertDeleteDLL {
	
	public static void main(String[] args) {
		
		DLL list = new DLL();
		list.insertAtTail(10);
		list.insertAtTail(20);
		list.insertAtTail(30);
		
		list.display();
		
		list.insertAtHead(5);
		list.insertAtHead(0);
		
		list.display();
		
		list.insertAtanyIndex(1,2);
		
		list.display();
		
		list.deleteAtanyIndex(1);
		
		list.display();
	}

}
