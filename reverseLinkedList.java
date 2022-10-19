public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode next = null;
    
        while(head != null){
          next = head.next;
          head.next = previous;
          previous = head;
          head = next;
        }
        head = previous;
  
   
   
    return head;
    }
