package LinkedList;

class SLL {  // User-defined data structure
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
            System.out.println(temp.val);
            temp = temp.next;  // Corrected assignment
        }
    }
}

public class ImplementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.print();
        System.out.println();
        System.out.println("Size of the LL is "+list.size);
        list.insertAtEnd(70);
        list.print();
    }
}
