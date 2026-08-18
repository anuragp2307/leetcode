class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null || head.next == null || k == 0) {
            return head;
        }

       
        ListNode curr = head;
        int len = 1;
        while (curr.next != null) {
            len++;
            curr = curr.next;
        }
        

        curr.next = head;

        
        k = k % len;
        int stepsToNewTail = len - k;

        
        ListNode newTail = curr; 
        while (stepsToNewTail > 0) {
            newTail = newTail.next;
            stepsToNewTail--;
        }

       
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}