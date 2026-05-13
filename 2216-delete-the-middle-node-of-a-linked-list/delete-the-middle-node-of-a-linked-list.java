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
    public ListNode deleteMiddle(ListNode head) {
        int len = 0;
        ListNode temp = head;
        int mid = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        mid = (len/2)-1;
        int count =0;
        ListNode temp2 = head;
        if(len == 1){
            return null;
        }
        if(len ==2){
            temp2.next = null;
            return head;
        }
        while(temp2.next != null){
            if(count == mid){
                temp2.next = temp2.next.next;
                break;
            }
            count++;
            temp2 = temp2.next;
        }
    return head;
    }
}