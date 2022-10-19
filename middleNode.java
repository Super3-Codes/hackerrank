public ListNode middleNode(ListNode head) {
        if(head== null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        
        ListNode first = head;
        ListNode second = head.next.next;
        while(second!= null && second.next != null){
            first = first.next;
            second = second.next.next;
        }
        return first.next;
    }
