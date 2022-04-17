class Node{
    Node next;
    int val;
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
}

class MyLinkedList {
    Node head;
    public MyLinkedList() {
        head=null;
    }
    public Node getTail(){
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        return current;
    }
    
       public int get(int index) {
    	int val = -1;
    	try {
	    	Node current = head;
	        for (int i = 1; i <= index; i++) {
	        	current = current.next;
	        }
	        val = current.val;
    	} catch(NullPointerException ne) {}
    	return val;
    }
    
    public void addAtHead(int val) {
       Node node=new Node(val,null);
        if(head==null) {
            head=node;
        }
        else
        {
            node.next=head;
        head=node;
        }
       
    }
    
    public void addAtTail(int val) {
        Node node=new Node(val,null);
        if(head==null) head=node;
        else
       { 
            Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
        }
    }
    
    public void addAtIndex(int index, int val) {
       if (index == 0) {
    		addAtHead(val);
    		return;
    	}
    	try {
	    	Node current = head;
	        for (int i = 1; i < index; i++) {
	        	current = current.next;
	        }
	        Node node = new Node(val, current.next);
	        current.next = node;
    	} catch(NullPointerException ne) {}
    }
 
 
    public void deleteAtIndex(int index) {
    	if (index == 0) {
    		head = head.next;
    		return;
    	}
    	try {
	    	Node node = head;
	        for (int i = 1; i < index; i++) {
	        	node = node.next;
	        }
	        node.next = node.next.next;
    	} catch(NullPointerException ne) {}
    }
}
