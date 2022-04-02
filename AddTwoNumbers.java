public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0,result=0;
        ListNode first=l1, second=l2;
        List<Integer> list=new ArrayList<>();
        while(first!=null||second!=null){
            if(first!=null&&second!=null){
                result=first.val+second.val+carry;
                first=first.next;
                second=second.next;
               }
            else if(first!=null&&second==null) {
                result=first.val+carry;
                first=first.next;
            }
            else if(first==null&&second!=null){
                result=second.val+carry;
                second=second.next;
            }
            carry=result/10;
            result=result%10; 
                    list.add(result);
    }
        if(carry!=0) list.add(carry);
         ListNode head=new ListNode(list.get(0));
        head.next=null;
        ListNode current=head;
        for(int i=1;i<list.size();i++){
            ListNode node=new ListNode(list.get(i));
            current.next=node;
            current=node;
        }
        return head;
}
