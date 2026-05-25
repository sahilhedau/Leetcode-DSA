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
        while(temp !=null){
            len++;
            temp = temp.next;
        }
        if(n == len){
            return head.next;
        }
        if(len == 1 || len == 0){
            return null;
        }
        int p = len - n;
        int count = 0;
        ListNode temp2 = head;
        while(temp2 != null){
            count++;
            if(count == p){
                temp2.next = temp2.next.next;
            }
            temp2 = temp2.next;
        }
    return head;
    }
}