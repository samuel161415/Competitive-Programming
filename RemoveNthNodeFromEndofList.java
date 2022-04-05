 public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        else if (head.next==null&&n==1) return null;
       ListNode slow=head;
        ListNode prev=head;
        int slowCount=0;
        int total=0;
        while(slow.next!=null){
            total++;
            slow=slow.next;
        }
        slow=head;
        while(total-slowCount!=(n-1)){
            slowCount++;
            prev=slow;
            slow=slow.next;
            
        }
        if(slowCount==0){
          head=head.next;  
        }
        else
        prev.next=slow.next;
        
        return head;
    }
