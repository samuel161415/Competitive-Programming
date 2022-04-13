 public ListNode sortList(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            list.add(current.val);
            current=current.next;
        }
        Collections.sort(list);
        current=head;
        int i=0;
        while(current!=null){
            current.val=list.get(i);
            current=current.next;
            i++;
        }
        return head;
    }
