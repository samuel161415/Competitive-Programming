 public ListNode deleteDuplicates(ListNode head) {
        Hashtable<Integer,Integer> hash=new Hashtable<>();
        ListNode current=head;
        ListNode prev=head;
        while(current!=null){
            if(hash.containsValue(current.val)) {
                prev.next=current.next;
            }
            else {
                hash.put(current.val,current.val);
                prev=current;
                
            }
            current=current.next;
        }
        return head;
    }
