class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode c1=head;
        int count=0;
        while(c1!=null){
            count++;
            c1=c1.next;
        }
        int index=count/2;
        ListNode c2=head;
        for(int i=0;i<index;i++){
            c2=c2.next;
        }
        return c2;
    }
}
