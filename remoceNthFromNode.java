 public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode start = new ListNode(0);
        
        start.next = head;
        ListNode temp = start;
        
        int sizeOfLL = lengthOfLL(head);
        int k = sizeOfLL - n ;
    
        int count = 1;
        
        while(count<k && temp!=null){
            temp = temp.next;
            count++;
        }
                
        if(temp!=null && temp.next!=null){
            temp.next = temp.next.next;
        }
        
        return start.next;
    }
     
    public int lengthOfLL(ListNode head){
        ListNode temp = head;
        int count = 1;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        
        return count;
    }
