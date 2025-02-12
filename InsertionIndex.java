package LinkedList;

class LL {  // User-defined data structure
    Node head;
    Node tail;
    int size =0;
	
	 void insertAtEnd(int val){
		Node temp = new Node(val);
		if (head == null) {
			head = tail = temp; 
		} 
		else 
			{ tail.next = temp; tail = temp; }
		size++;
	}
	 
    
    void insertAtHead(int val) {
    	Node temp =new Node(val);
    	if(head ==null) head = tail = temp;
    	else {
    		temp.next = head;
    		head=temp;
    	}
    	size++;
    }

    void print() {
        Node temp = head;
        while (temp != null) {  // Corrected loop condition
            System.out.print(temp.val+" ");
            temp = temp.next;  // Corrected assignment
        }
    }
  //Insert at any index
    void insert(int indx,int val) {
    	
   	 	if(indx==0) {
   	 		insertAtHead(val);
   	 	}
   	 	if(indx==size) {
   	 		insertAtEnd(val);
   	 	}
   	 	if(indx>size ||indx<0) {
   	 		System.out.println("Index Out of Bound");
   	 	}
   	 	
   	 	Node temp = new Node(val);
   	 	Node x =head;
   	 	for(int i =0;i<indx-1;i++) {
   	 		x=x.next;
   	 	}
   	 	temp.next =x.next;
   	 	x.next = temp;
   	 	size++;
    }
}
public class InsertionIndex {
	public static void main(String[] args) {
		LL list = new LL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.print();
        System.out.println();
        System.out.println("Size of the LL is "+list.size);
    
       list.insert(2,25);
       list.print();
       System.out.println();
       System.out.println("Size of the LL is "+list.size);
	}

}
