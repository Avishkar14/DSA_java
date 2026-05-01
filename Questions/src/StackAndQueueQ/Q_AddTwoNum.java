package StackAndQueueQ;

/**
 * Definition for singly-linked list.*/
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Q_AddTwoNum {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode node = new ListNode(0);
        ListNode head = node;
        int ans = 0, carry = 0;
        while( l1 != null && l2 != null){
            ans = l1.val + l2.val + carry;
            carry = 0; //reset carry after use;
            if( ans > 9){
                node.val = ans%10;
                carry = 1;
            }
            else{
                node.val = ans;
            }
            l1 = l1.next;
            l2 = l2.next;
            if( l1 != null || l2 != null || carry == 1){
                node.next = new ListNode(0);
                node = node.next;
            }
            

        }

        //any one loop ended:
        if( l1 == null){
            //l2 remain :
            while( l2 != null){
                ans = l2.val + carry;
                carry = 0;
                if( ans > 9 ){
                    node.val = ans%10;
                    carry = 1;
                }
                else{
                    node.val = ans;
                }
                l2 = l2.next;
                if( l1 != null || l2 != null || carry == 1){
                    node.next = new ListNode(0);
                    node = node.next;
                }                
            }
        }
        else{
            //l1 remain:
            while( l1 != null){
                ans = l1.val + carry;
                carry = 0;
                if( ans > 9 ){
                    node.val = ans%10;
                    carry = 1;
                }
                else{
                    node.val = ans;
                }
                l1 = l1.next;
                if( l1 != null || l2 != null || carry == 1){
                    node.next = new ListNode(0);
                    node = node.next;
                }
            }

        }
//carry remains:
        if( carry == 1){
            node.val = carry;
        }
        return head;
    }
}
