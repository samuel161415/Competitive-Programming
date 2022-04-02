public int[] nextLargerNodes(ListNode head) {
        List<Integer> list=new ArrayList<>();
        int[] number;
        if(head==null) return null;
        ListNode slow=head;
        ListNode fast=head.next;
        while(slow.next!=null){
                while(fast!=null){
                    if(slow.val<fast.val){
                        list.add(fast.val);
                        break;
                    }
                    fast=fast.next;
                    if(fast==null) list.add(0);
                }
            slow=slow.next;
            if(slow!=null)
            fast=slow.next;
        }
       list.add(0);
        number=new int[list.size()];
        for(int i=0;i<list.size();i++){
            number[i]=list.get(i);
        }
        
        return number;
    }
