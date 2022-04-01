 public boolean isPalindrome(ListNode head) {
        ListNode current=head;
        List<Integer> list=new ArrayList<>();
        while(current!=null){
            list.add(current.val);
            current=current.next;
        }
        int start=0;
        int end=list.size()-1;
      
        while(start<end){
            if(list.get(start)!=list.get(end)) return false;
            start++;
            end--;
        }
        return true;
    }
