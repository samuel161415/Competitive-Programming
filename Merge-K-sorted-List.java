import java.util.*;
class Solution {
     ListNode head;
    ListNode tail;
  public ListNode mergeKLists(ListNode[] lists) { 
      ArrayList<Integer> list=new ArrayList<Integer>();
      for(int i=0;i<lists.length;i++){
          ListNode current=lists[i];
          while(current!=null){
         list.add(current.val);
         current=current.next;  }}
      Collections.sort(list);
      for(int i=0;i<list.size();i++){
          insertLast(list.get(i)); }
       return head; }
      public void insertLast(int data){
        ListNode node=new ListNode();
        node.val=data;
        node.next=null;
        if(head==null) head=node;
        else{
            ListNode current=head;
            while(current.next!=null){
                current=current.next; }
            current.next=node;  }}}
    
