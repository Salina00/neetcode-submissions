/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(n == len){
            return head.next;
        }
        int len2 = len - n - 1;
        temp = head;
        while(len2 != 0){
            temp = temp.next;
            len2--;
        }
        temp.next = temp.next.next;
        return head;
    }
}
