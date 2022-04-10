class MyCircularDeque {
    int[] deque;
   int front;
    int rear;
    public MyCircularDeque(int k) {
        deque=new int[k];
        front=-1;
        rear=0;
    }
    
    public boolean insertFront(int value) {
       if(isFull()) return false;
        
        else{
            if(front==-1) {
                front=0;
                rear=0;
            }
            else if(front==0) front=deque.length-1;
            else  front--;
               deque[front]=value;
        }
        return true;
       
        
        
    }
    
    public boolean insertLast(int value) {
         if(isFull()) return false;
        else {
            if(front==-1) {
             front=0;
                rear=0;
            }
           else rear=(rear+1)%deque.length;
            deque[rear]=value;
        }
        return true;
        
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        if(front==rear) { // one element
            front=-1;
            rear=-1;
        }
        else{
            front=(front+1)%deque.length;
            
        }
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        if(rear==front) {
            rear=-1;
        front=-1;
        }
        else{
            if(rear==0) rear=deque.length-1;
            else rear--; 
        }
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        return deque[front];
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        return deque[rear];
    }
    
    public boolean isEmpty() {
        return (front==-1);
    }
    
    public boolean isFull() {
        return ((front==0&&rear==deque.length-1)||front==rear+1);
    }
}

