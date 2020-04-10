class addTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode new_head = new ListNode(0);
        ListNode l3 = new_head;
        int carry =0;
        while(l1!=null || l2!=null){
            int l1val = (l1 != null) ? l1.val : 0;
            int l2val = (l2 != null) ? l2.val : 0;
            int sum = l1val+l2val+carry;
            carry = sum/10;
           int lastdigit = sum%10;
            ListNode new_node = new ListNode(lastdigit);
            l3.next = new_node;
            
            if(l1 !=null ){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if(carry > 0){
            ListNode new_node = new ListNode(carry);
            l3.next=new_node;
            l3 = l3.next;
        }
        return new_head.next;
    }
   
}
