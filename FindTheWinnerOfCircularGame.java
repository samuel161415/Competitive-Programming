 public int findTheWinner(int n, int k) {
        List<Integer> list=new ArrayList();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        
        System.out.println(winner(list,0,k));
        return list.get(0);
    }
    public List<Integer> winner(List<Integer> list,int start, int k){
        if(list.size()==1) return list;
        else {
            int r=(start+k-1)%list.size();
         list.remove(r);
            start=r;
               winner(list,start,k); 
        }
        return list;
    }
