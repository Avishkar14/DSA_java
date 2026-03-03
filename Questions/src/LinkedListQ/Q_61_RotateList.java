package LinkedListQ;

//LL med Q : https://leetcode.com/problems/rotate-list/
class Q_61_RotateList {
    //psvm
    public static ListNode rotateRight(ListNode head, int k) {
        if( head == null || k < 1){
            return head;
        }

        int size = 1;
        ListNode temp = head;
        ListNode newEnd = head;
        // ListNode last = head; 

        while( temp.next != null ){ //size is counted.
            temp = temp.next;
            size++;
        }

        if( k%size == 0){
            return head;
        }
        else{
            //traverse till size%k th node:
            temp = head;
            int i = 1;
            while( i != size - k%size ){
                temp = temp.next;
                i++;
            }
            // newEnd = temp;
            // newEnd.next = null;
            head = temp.next;
            temp.next = null;
            temp = head;

            while( temp.next != null){
                temp = temp.next;
            }
            // last = temp;
            // last.next = newEnd;
            temp.next = newEnd;

        }

        return head;

    }
}