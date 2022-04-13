 public void reorderList(ListNode head) {
        ListNode c=head;
        List<Integer> list=new ArrayList<>();
        
        while(c!=null){
            list.add(c.val);
            c=c.next;
        }
        int start=0;
        int end=list.size()-1;
        int temp=0;
        int temp2=0;
        int index=0;
        ListNode c2=head;
        while(c2!=null){
            if(start==0&&end==list.size()-1){
                start++;
            }
            else if(index%2==1){
                c2.val=list.get(end);
                end--;
            }
            else if(index%2==0){
              c2.val=list.get(start);
                start++;
            }
            index++;
            c2=c2.next;
        }
    }
