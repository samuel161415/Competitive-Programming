class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null) return head;
        ListNode c=head;
        List<Integer> list=new ArrayList<>();
        while(c.next!=null){
            list.add(c.val);
            c=c.next;
        }
        ListNode head2=new ListNode(c.val);
        ListNode c2=head2;
        for(int i=list.size()-1;i>=0;i--){
           ListNode newNode=new ListNode(list.get(i));
            c2.next=newNode; 
            c2=c2.next;
        }
        
       return head2; 
    }
}
