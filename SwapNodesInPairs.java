public ListNode swapPairs(ListNode head) {
         if(head==null) return null;
        if(head.next==null) return head;
       ListNode c1=head;
        int count=0;
        while(c1!=null){
            count++;
            c1=c1.next;
        }
        c1=head;
        ListNode n=head.next;
        int temp;
        while(n!=null&&n.next!=null){
            temp=c1.val;// head
            c1.val=n.val; 
            n.val=temp;
            c1=n.next;
            n=c1.next;
            count=count-2;
        }
        if(count==2)
        {temp=c1.val;
        c1.val=n.val;
        n.val=temp;
        }
        return head;
    }
