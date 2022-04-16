    public int pairSum(ListNode head) {
        ListNode c=head;
        int l=0;
      List<Integer> list=new ArrayList();
        while(c!=null){
            list.add(c.val);
            c=c.next;
        }
        int start=0;
        int end=list.size()-1;
        int sum=0;
       while(start<end){
          if(list.get(start)+list.get(end)>sum) sum=list.get(start)+list.get(end);
           start++;
           end--;
       }
        return sum;
    }
